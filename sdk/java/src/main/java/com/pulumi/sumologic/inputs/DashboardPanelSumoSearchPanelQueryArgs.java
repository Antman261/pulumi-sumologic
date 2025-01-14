// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.DashboardPanelSumoSearchPanelQueryMetricsQueryDataArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardPanelSumoSearchPanelQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardPanelSumoSearchPanelQueryArgs Empty = new DashboardPanelSumoSearchPanelQueryArgs();

    @Import(name="metricsQueryData")
    private @Nullable Output<DashboardPanelSumoSearchPanelQueryMetricsQueryDataArgs> metricsQueryData;

    public Optional<Output<DashboardPanelSumoSearchPanelQueryMetricsQueryDataArgs>> metricsQueryData() {
        return Optional.ofNullable(this.metricsQueryData);
    }

    @Import(name="metricsQueryMode")
    private @Nullable Output<String> metricsQueryMode;

    public Optional<Output<String>> metricsQueryMode() {
        return Optional.ofNullable(this.metricsQueryMode);
    }

    @Import(name="queryKey", required=true)
    private Output<String> queryKey;

    public Output<String> queryKey() {
        return this.queryKey;
    }

    @Import(name="queryString", required=true)
    private Output<String> queryString;

    public Output<String> queryString() {
        return this.queryString;
    }

    @Import(name="queryType", required=true)
    private Output<String> queryType;

    public Output<String> queryType() {
        return this.queryType;
    }

    private DashboardPanelSumoSearchPanelQueryArgs() {}

    private DashboardPanelSumoSearchPanelQueryArgs(DashboardPanelSumoSearchPanelQueryArgs $) {
        this.metricsQueryData = $.metricsQueryData;
        this.metricsQueryMode = $.metricsQueryMode;
        this.queryKey = $.queryKey;
        this.queryString = $.queryString;
        this.queryType = $.queryType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardPanelSumoSearchPanelQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardPanelSumoSearchPanelQueryArgs $;

        public Builder() {
            $ = new DashboardPanelSumoSearchPanelQueryArgs();
        }

        public Builder(DashboardPanelSumoSearchPanelQueryArgs defaults) {
            $ = new DashboardPanelSumoSearchPanelQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder metricsQueryData(@Nullable Output<DashboardPanelSumoSearchPanelQueryMetricsQueryDataArgs> metricsQueryData) {
            $.metricsQueryData = metricsQueryData;
            return this;
        }

        public Builder metricsQueryData(DashboardPanelSumoSearchPanelQueryMetricsQueryDataArgs metricsQueryData) {
            return metricsQueryData(Output.of(metricsQueryData));
        }

        public Builder metricsQueryMode(@Nullable Output<String> metricsQueryMode) {
            $.metricsQueryMode = metricsQueryMode;
            return this;
        }

        public Builder metricsQueryMode(String metricsQueryMode) {
            return metricsQueryMode(Output.of(metricsQueryMode));
        }

        public Builder queryKey(Output<String> queryKey) {
            $.queryKey = queryKey;
            return this;
        }

        public Builder queryKey(String queryKey) {
            return queryKey(Output.of(queryKey));
        }

        public Builder queryString(Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder queryType(Output<String> queryType) {
            $.queryType = queryType;
            return this;
        }

        public Builder queryType(String queryType) {
            return queryType(Output.of(queryType));
        }

        public DashboardPanelSumoSearchPanelQueryArgs build() {
            $.queryKey = Objects.requireNonNull($.queryKey, "expected parameter 'queryKey' to be non-null");
            $.queryString = Objects.requireNonNull($.queryString, "expected parameter 'queryString' to be non-null");
            $.queryType = Objects.requireNonNull($.queryType, "expected parameter 'queryType' to be non-null");
            return $;
        }
    }

}
