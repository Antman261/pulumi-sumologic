// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.AwsInventorySourceAuthenticationArgs;
import com.pulumi.sumologic.inputs.AwsInventorySourceDefaultDateFormatArgs;
import com.pulumi.sumologic.inputs.AwsInventorySourceFilterArgs;
import com.pulumi.sumologic.inputs.AwsInventorySourcePathArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsInventorySourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsInventorySourceArgs Empty = new AwsInventorySourceArgs();

    /**
     * Authentication details to access AWS `Describe*` APIs.
     * 
     */
    @Import(name="authentication", required=true)
    private Output<AwsInventorySourceAuthenticationArgs> authentication;

    /**
     * @return Authentication details to access AWS `Describe*` APIs.
     * 
     */
    public Output<AwsInventorySourceAuthenticationArgs> authentication() {
        return this.authentication;
    }

    @Import(name="automaticDateParsing")
    private @Nullable Output<Boolean> automaticDateParsing;

    public Optional<Output<Boolean>> automaticDateParsing() {
        return Optional.ofNullable(this.automaticDateParsing);
    }

    @Import(name="category")
    private @Nullable Output<String> category;

    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    @Import(name="collectorId", required=true)
    private Output<Integer> collectorId;

    public Output<Integer> collectorId() {
        return this.collectorId;
    }

    /**
     * The content-type of the collected data. This has to be `AwsInventoryPath` for AWS Inventory source.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    /**
     * @return The content-type of the collected data. This has to be `AwsInventoryPath` for AWS Inventory source.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }

    @Import(name="cutoffRelativeTime")
    private @Nullable Output<String> cutoffRelativeTime;

    public Optional<Output<String>> cutoffRelativeTime() {
        return Optional.ofNullable(this.cutoffRelativeTime);
    }

    @Import(name="cutoffTimestamp")
    private @Nullable Output<Integer> cutoffTimestamp;

    public Optional<Output<Integer>> cutoffTimestamp() {
        return Optional.ofNullable(this.cutoffTimestamp);
    }

    @Import(name="defaultDateFormats")
    private @Nullable Output<List<AwsInventorySourceDefaultDateFormatArgs>> defaultDateFormats;

    public Optional<Output<List<AwsInventorySourceDefaultDateFormatArgs>>> defaultDateFormats() {
        return Optional.ofNullable(this.defaultDateFormats);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="fields")
    private @Nullable Output<Map<String,String>> fields;

    public Optional<Output<Map<String,String>>> fields() {
        return Optional.ofNullable(this.fields);
    }

    @Import(name="filters")
    private @Nullable Output<List<AwsInventorySourceFilterArgs>> filters;

    public Optional<Output<List<AwsInventorySourceFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="forceTimezone")
    private @Nullable Output<Boolean> forceTimezone;

    public Optional<Output<Boolean>> forceTimezone() {
        return Optional.ofNullable(this.forceTimezone);
    }

    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    @Import(name="manualPrefixRegexp")
    private @Nullable Output<String> manualPrefixRegexp;

    public Optional<Output<String>> manualPrefixRegexp() {
        return Optional.ofNullable(this.manualPrefixRegexp);
    }

    @Import(name="multilineProcessingEnabled")
    private @Nullable Output<Boolean> multilineProcessingEnabled;

    public Optional<Output<Boolean>> multilineProcessingEnabled() {
        return Optional.ofNullable(this.multilineProcessingEnabled);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The location to scan for new data.
     * 
     */
    @Import(name="path", required=true)
    private Output<AwsInventorySourcePathArgs> path;

    /**
     * @return The location to scan for new data.
     * 
     */
    public Output<AwsInventorySourcePathArgs> path() {
        return this.path;
    }

    /**
     * When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    @Import(name="paused", required=true)
    private Output<Boolean> paused;

    /**
     * @return When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    public Output<Boolean> paused() {
        return this.paused;
    }

    /**
     * Time interval in milliseconds of scans for new data. The minimum value is 1000 milliseconds. Currently this value is not respected.
     * 
     */
    @Import(name="scanInterval", required=true)
    private Output<Integer> scanInterval;

    /**
     * @return Time interval in milliseconds of scans for new data. The minimum value is 1000 milliseconds. Currently this value is not respected.
     * 
     */
    public Output<Integer> scanInterval() {
        return this.scanInterval;
    }

    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    @Import(name="useAutolineMatching")
    private @Nullable Output<Boolean> useAutolineMatching;

    public Optional<Output<Boolean>> useAutolineMatching() {
        return Optional.ofNullable(this.useAutolineMatching);
    }

    private AwsInventorySourceArgs() {}

    private AwsInventorySourceArgs(AwsInventorySourceArgs $) {
        this.authentication = $.authentication;
        this.automaticDateParsing = $.automaticDateParsing;
        this.category = $.category;
        this.collectorId = $.collectorId;
        this.contentType = $.contentType;
        this.cutoffRelativeTime = $.cutoffRelativeTime;
        this.cutoffTimestamp = $.cutoffTimestamp;
        this.defaultDateFormats = $.defaultDateFormats;
        this.description = $.description;
        this.fields = $.fields;
        this.filters = $.filters;
        this.forceTimezone = $.forceTimezone;
        this.hostName = $.hostName;
        this.manualPrefixRegexp = $.manualPrefixRegexp;
        this.multilineProcessingEnabled = $.multilineProcessingEnabled;
        this.name = $.name;
        this.path = $.path;
        this.paused = $.paused;
        this.scanInterval = $.scanInterval;
        this.timezone = $.timezone;
        this.useAutolineMatching = $.useAutolineMatching;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsInventorySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsInventorySourceArgs $;

        public Builder() {
            $ = new AwsInventorySourceArgs();
        }

        public Builder(AwsInventorySourceArgs defaults) {
            $ = new AwsInventorySourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication Authentication details to access AWS `Describe*` APIs.
         * 
         * @return builder
         * 
         */
        public Builder authentication(Output<AwsInventorySourceAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Authentication details to access AWS `Describe*` APIs.
         * 
         * @return builder
         * 
         */
        public Builder authentication(AwsInventorySourceAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        public Builder automaticDateParsing(@Nullable Output<Boolean> automaticDateParsing) {
            $.automaticDateParsing = automaticDateParsing;
            return this;
        }

        public Builder automaticDateParsing(Boolean automaticDateParsing) {
            return automaticDateParsing(Output.of(automaticDateParsing));
        }

        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        public Builder category(String category) {
            return category(Output.of(category));
        }

        public Builder collectorId(Output<Integer> collectorId) {
            $.collectorId = collectorId;
            return this;
        }

        public Builder collectorId(Integer collectorId) {
            return collectorId(Output.of(collectorId));
        }

        /**
         * @param contentType The content-type of the collected data. This has to be `AwsInventoryPath` for AWS Inventory source.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content-type of the collected data. This has to be `AwsInventoryPath` for AWS Inventory source.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder cutoffRelativeTime(@Nullable Output<String> cutoffRelativeTime) {
            $.cutoffRelativeTime = cutoffRelativeTime;
            return this;
        }

        public Builder cutoffRelativeTime(String cutoffRelativeTime) {
            return cutoffRelativeTime(Output.of(cutoffRelativeTime));
        }

        public Builder cutoffTimestamp(@Nullable Output<Integer> cutoffTimestamp) {
            $.cutoffTimestamp = cutoffTimestamp;
            return this;
        }

        public Builder cutoffTimestamp(Integer cutoffTimestamp) {
            return cutoffTimestamp(Output.of(cutoffTimestamp));
        }

        public Builder defaultDateFormats(@Nullable Output<List<AwsInventorySourceDefaultDateFormatArgs>> defaultDateFormats) {
            $.defaultDateFormats = defaultDateFormats;
            return this;
        }

        public Builder defaultDateFormats(List<AwsInventorySourceDefaultDateFormatArgs> defaultDateFormats) {
            return defaultDateFormats(Output.of(defaultDateFormats));
        }

        public Builder defaultDateFormats(AwsInventorySourceDefaultDateFormatArgs... defaultDateFormats) {
            return defaultDateFormats(List.of(defaultDateFormats));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder fields(@Nullable Output<Map<String,String>> fields) {
            $.fields = fields;
            return this;
        }

        public Builder fields(Map<String,String> fields) {
            return fields(Output.of(fields));
        }

        public Builder filters(@Nullable Output<List<AwsInventorySourceFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<AwsInventorySourceFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(AwsInventorySourceFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder forceTimezone(@Nullable Output<Boolean> forceTimezone) {
            $.forceTimezone = forceTimezone;
            return this;
        }

        public Builder forceTimezone(Boolean forceTimezone) {
            return forceTimezone(Output.of(forceTimezone));
        }

        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        public Builder manualPrefixRegexp(@Nullable Output<String> manualPrefixRegexp) {
            $.manualPrefixRegexp = manualPrefixRegexp;
            return this;
        }

        public Builder manualPrefixRegexp(String manualPrefixRegexp) {
            return manualPrefixRegexp(Output.of(manualPrefixRegexp));
        }

        public Builder multilineProcessingEnabled(@Nullable Output<Boolean> multilineProcessingEnabled) {
            $.multilineProcessingEnabled = multilineProcessingEnabled;
            return this;
        }

        public Builder multilineProcessingEnabled(Boolean multilineProcessingEnabled) {
            return multilineProcessingEnabled(Output.of(multilineProcessingEnabled));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The location to scan for new data.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<AwsInventorySourcePathArgs> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The location to scan for new data.
         * 
         * @return builder
         * 
         */
        public Builder path(AwsInventorySourcePathArgs path) {
            return path(Output.of(path));
        }

        /**
         * @param paused When set to true, the scanner is paused. To disable, set to false.
         * 
         * @return builder
         * 
         */
        public Builder paused(Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused When set to true, the scanner is paused. To disable, set to false.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param scanInterval Time interval in milliseconds of scans for new data. The minimum value is 1000 milliseconds. Currently this value is not respected.
         * 
         * @return builder
         * 
         */
        public Builder scanInterval(Output<Integer> scanInterval) {
            $.scanInterval = scanInterval;
            return this;
        }

        /**
         * @param scanInterval Time interval in milliseconds of scans for new data. The minimum value is 1000 milliseconds. Currently this value is not respected.
         * 
         * @return builder
         * 
         */
        public Builder scanInterval(Integer scanInterval) {
            return scanInterval(Output.of(scanInterval));
        }

        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public Builder useAutolineMatching(@Nullable Output<Boolean> useAutolineMatching) {
            $.useAutolineMatching = useAutolineMatching;
            return this;
        }

        public Builder useAutolineMatching(Boolean useAutolineMatching) {
            return useAutolineMatching(Output.of(useAutolineMatching));
        }

        public AwsInventorySourceArgs build() {
            $.authentication = Objects.requireNonNull($.authentication, "expected parameter 'authentication' to be non-null");
            $.collectorId = Objects.requireNonNull($.collectorId, "expected parameter 'collectorId' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.paused = Objects.requireNonNull($.paused, "expected parameter 'paused' to be non-null");
            $.scanInterval = Objects.requireNonNull($.scanInterval, "expected parameter 'scanInterval' to be non-null");
            return $;
        }
    }

}
