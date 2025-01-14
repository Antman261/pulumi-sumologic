// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpMetricsSourceAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpMetricsSourceAuthenticationArgs Empty = new GcpMetricsSourceAuthenticationArgs();

    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="authProviderX509CertUrl")
    private @Nullable Output<String> authProviderX509CertUrl;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> authProviderX509CertUrl() {
        return Optional.ofNullable(this.authProviderX509CertUrl);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="authUri")
    private @Nullable Output<String> authUri;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> authUri() {
        return Optional.ofNullable(this.authUri);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="clientEmail")
    private @Nullable Output<String> clientEmail;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> clientEmail() {
        return Optional.ofNullable(this.clientEmail);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="clientX509CertUrl")
    private @Nullable Output<String> clientX509CertUrl;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> clientX509CertUrl() {
        return Optional.ofNullable(this.clientX509CertUrl);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="privateKeyId")
    private @Nullable Output<String> privateKeyId;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> privateKeyId() {
        return Optional.ofNullable(this.privateKeyId);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * As per the service_account.json downloaded from GCP
     * 
     */
    @Import(name="tokenUri")
    private @Nullable Output<String> tokenUri;

    /**
     * @return As per the service_account.json downloaded from GCP
     * 
     */
    public Optional<Output<String>> tokenUri() {
        return Optional.ofNullable(this.tokenUri);
    }

    /**
     * Type of polling source. This has to be `GcpMetricsPath`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of polling source. This has to be `GcpMetricsPath`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private GcpMetricsSourceAuthenticationArgs() {}

    private GcpMetricsSourceAuthenticationArgs(GcpMetricsSourceAuthenticationArgs $) {
        this.accessKey = $.accessKey;
        this.authProviderX509CertUrl = $.authProviderX509CertUrl;
        this.authUri = $.authUri;
        this.clientEmail = $.clientEmail;
        this.clientId = $.clientId;
        this.clientX509CertUrl = $.clientX509CertUrl;
        this.privateKey = $.privateKey;
        this.privateKeyId = $.privateKeyId;
        this.projectId = $.projectId;
        this.region = $.region;
        this.roleArn = $.roleArn;
        this.secretKey = $.secretKey;
        this.tokenUri = $.tokenUri;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpMetricsSourceAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpMetricsSourceAuthenticationArgs $;

        public Builder() {
            $ = new GcpMetricsSourceAuthenticationArgs();
        }

        public Builder(GcpMetricsSourceAuthenticationArgs defaults) {
            $ = new GcpMetricsSourceAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param authProviderX509CertUrl As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder authProviderX509CertUrl(@Nullable Output<String> authProviderX509CertUrl) {
            $.authProviderX509CertUrl = authProviderX509CertUrl;
            return this;
        }

        /**
         * @param authProviderX509CertUrl As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder authProviderX509CertUrl(String authProviderX509CertUrl) {
            return authProviderX509CertUrl(Output.of(authProviderX509CertUrl));
        }

        /**
         * @param authUri As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder authUri(@Nullable Output<String> authUri) {
            $.authUri = authUri;
            return this;
        }

        /**
         * @param authUri As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder authUri(String authUri) {
            return authUri(Output.of(authUri));
        }

        /**
         * @param clientEmail As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(@Nullable Output<String> clientEmail) {
            $.clientEmail = clientEmail;
            return this;
        }

        /**
         * @param clientEmail As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(String clientEmail) {
            return clientEmail(Output.of(clientEmail));
        }

        /**
         * @param clientId As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientX509CertUrl As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder clientX509CertUrl(@Nullable Output<String> clientX509CertUrl) {
            $.clientX509CertUrl = clientX509CertUrl;
            return this;
        }

        /**
         * @param clientX509CertUrl As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder clientX509CertUrl(String clientX509CertUrl) {
            return clientX509CertUrl(Output.of(clientX509CertUrl));
        }

        /**
         * @param privateKey As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param privateKeyId As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder privateKeyId(@Nullable Output<String> privateKeyId) {
            $.privateKeyId = privateKeyId;
            return this;
        }

        /**
         * @param privateKeyId As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder privateKeyId(String privateKeyId) {
            return privateKeyId(Output.of(privateKeyId));
        }

        /**
         * @param projectId As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param tokenUri As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder tokenUri(@Nullable Output<String> tokenUri) {
            $.tokenUri = tokenUri;
            return this;
        }

        /**
         * @param tokenUri As per the service_account.json downloaded from GCP
         * 
         * @return builder
         * 
         */
        public Builder tokenUri(String tokenUri) {
            return tokenUri(Output.of(tokenUri));
        }

        /**
         * @param type Type of polling source. This has to be `GcpMetricsPath`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of polling source. This has to be `GcpMetricsPath`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GcpMetricsSourceAuthenticationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
