/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.AddressSpace;
import com.microsoft.azure.management.network.PointToSiteConfiguration;
import com.microsoft.azure.management.network.VirtualNetworkGateway;
import com.microsoft.azure.management.network.VpnClientConfiguration;
import com.microsoft.azure.management.network.VpnClientProtocol;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.IndexableWrapperImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implementation for PointToSiteConfiguration and its create and update interfaces.
 */
@LangDefinition
class PointToSiteConfigurationImpl
        extends IndexableWrapperImpl<VpnClientConfiguration>
        implements
        PointToSiteConfiguration,
        PointToSiteConfiguration.Definition<VirtualNetworkGateway.Update>,
        PointToSiteConfiguration.Update {
    private static final String BEGIN_CERT = "-----BEGIN CERTIFICATE-----";
    private  static final String END_CERT = "-----END CERTIFICATE-----";

    private VirtualNetworkGatewayImpl parent;

    PointToSiteConfigurationImpl(VpnClientConfiguration inner, VirtualNetworkGatewayImpl parent) {
        super(inner);
        this.parent = parent;
    }

    @Override
    public VirtualNetworkGatewayImpl attach() {
        parent.attachPointToSiteConfiguration(this);
        return parent;
    }

    @Override
    public PointToSiteConfigurationImpl withAddressPool(String addressPool) {
        List<String> addressPrefixes = new ArrayList<>();
        addressPrefixes.add(addressPool);
        inner().withVpnClientAddressPool(new AddressSpace().withAddressPrefixes(addressPrefixes));
        return this;
    }

    @Override
    public PointToSiteConfigurationImpl withAzureCertificate(String name, String certificateData) {
        if (inner().vpnClientRootCertificates() == null) {
            inner().withVpnClientRootCertificates(new ArrayList<VpnClientRootCertificateInner>());
        }
        inner().vpnClientRootCertificates().add(new VpnClientRootCertificateInner().withName(name).withPublicCertData(certificateData));
        inner().withRadiusServerAddress(null).withRadiusServerSecret(null);
        return this;
    }

    @Override
    public PointToSiteConfigurationImpl withAzureCertificateFromFile(String name, File certificateFile) throws IOException {
        if (certificateFile == null) {
            return this;
        } else {
            byte[] content = Files.readAllBytes(certificateFile.toPath());
            String certificate = new String(content).replace(BEGIN_CERT, "").replace(END_CERT, "");
            return this.withAzureCertificate(name, certificate);
        }
    }

    @Override
    public Update withoutAzureCertificate(String name) {
        if (inner().vpnClientRootCertificates() != null) {
            for (VpnClientRootCertificateInner certificateInner : inner().vpnClientRootCertificates()) {
                if (name.equals(certificateInner.name())) {
                    inner().vpnClientRootCertificates().remove(certificateInner);
                    break;
                }
            }
        }
        return this;
    }

    @Override
    public PointToSiteConfigurationImpl withRadiusAuthentication(String serverIPAddress, String serverSecret) {
        inner().withRadiusServerAddress(serverIPAddress).withRadiusServerSecret(serverSecret);
        inner().withVpnClientRootCertificates(null);
        inner().withVpnClientRevokedCertificates(null);
        return this;
    }

    @Override
    public PointToSiteConfigurationImpl withRevokedCertificate(String name, String thumbprint) {
        if (inner().vpnClientRevokedCertificates() == null) {
            inner().withVpnClientRevokedCertificates(new ArrayList<VpnClientRevokedCertificateInner>());
        }
        inner().vpnClientRevokedCertificates().add(new VpnClientRevokedCertificateInner().withName(name).withThumbprint(thumbprint));
        inner().withRadiusServerAddress(null).withRadiusServerSecret(null);
        return this;
    }

    @Override
    public PointToSiteConfigurationImpl withSstpOnly() {
        inner().withVpnClientProtocols(Collections.singletonList(VpnClientProtocol.SSTP));
        return this;
    }

    @Override
    public PointToSiteConfigurationImpl withIkeV2Only() {
        inner().withVpnClientProtocols(Collections.singletonList(VpnClientProtocol.IKE_V2));
        return this;
    }

    @Override
    public VirtualNetworkGateway.Update parent() {
        return parent;
    }
}
