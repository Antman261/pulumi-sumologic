// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.S3AuditSourceAuthenticationArgs;
import com.pulumi.sumologic.inputs.S3AuditSourceDefaultDateFormatArgs;
import com.pulumi.sumologic.inputs.S3AuditSourceFilterArgs;
import com.pulumi.sumologic.inputs.S3AuditSourcePathArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class S3AuditSourceState extends com.pulumi.resources.ResourceArgs {

    public static final S3AuditSourceState Empty = new S3AuditSourceState();

    /**
     * Authentication details for connecting to the S3 bucket.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<S3AuditSourceAuthenticationArgs> authentication;

    /**
     * @return Authentication details for connecting to the S3 bucket.
     * 
     */
    public Optional<Output<S3AuditSourceAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
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

    @Import(name="collectorId")
    private @Nullable Output<Integer> collectorId;

    public Optional<Output<Integer>> collectorId() {
        return Optional.ofNullable(this.collectorId);
    }

    /**
     * The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
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
    private @Nullable Output<List<S3AuditSourceDefaultDateFormatArgs>> defaultDateFormats;

    public Optional<Output<List<S3AuditSourceDefaultDateFormatArgs>>> defaultDateFormats() {
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
    private @Nullable Output<List<S3AuditSourceFilterArgs>> filters;

    public Optional<Output<List<S3AuditSourceFilterArgs>>> filters() {
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
    @Import(name="path")
    private @Nullable Output<S3AuditSourcePathArgs> path;

    /**
     * @return The location to scan for new data.
     * 
     */
    public Optional<Output<S3AuditSourcePathArgs>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return When set to true, the scanner is paused. To disable, set to false.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
     * 
     */
    @Import(name="scanInterval")
    private @Nullable Output<Integer> scanInterval;

    /**
     * @return Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
     * 
     */
    public Optional<Output<Integer>> scanInterval() {
        return Optional.ofNullable(this.scanInterval);
    }

    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    /**
     * The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](&lt;https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)&gt;).
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](&lt;https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)&gt;).
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    @Import(name="useAutolineMatching")
    private @Nullable Output<Boolean> useAutolineMatching;

    public Optional<Output<Boolean>> useAutolineMatching() {
        return Optional.ofNullable(this.useAutolineMatching);
    }

    private S3AuditSourceState() {}

    private S3AuditSourceState(S3AuditSourceState $) {
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
        this.url = $.url;
        this.useAutolineMatching = $.useAutolineMatching;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(S3AuditSourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private S3AuditSourceState $;

        public Builder() {
            $ = new S3AuditSourceState();
        }

        public Builder(S3AuditSourceState defaults) {
            $ = new S3AuditSourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication Authentication details for connecting to the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<S3AuditSourceAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Authentication details for connecting to the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder authentication(S3AuditSourceAuthenticationArgs authentication) {
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

        public Builder collectorId(@Nullable Output<Integer> collectorId) {
            $.collectorId = collectorId;
            return this;
        }

        public Builder collectorId(Integer collectorId) {
            return collectorId(Output.of(collectorId));
        }

        /**
         * @param contentType The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content-type of the collected data. Details can be found in the [Sumologic documentation for hosted sources](https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources).
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

        public Builder defaultDateFormats(@Nullable Output<List<S3AuditSourceDefaultDateFormatArgs>> defaultDateFormats) {
            $.defaultDateFormats = defaultDateFormats;
            return this;
        }

        public Builder defaultDateFormats(List<S3AuditSourceDefaultDateFormatArgs> defaultDateFormats) {
            return defaultDateFormats(Output.of(defaultDateFormats));
        }

        public Builder defaultDateFormats(S3AuditSourceDefaultDateFormatArgs... defaultDateFormats) {
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

        public Builder filters(@Nullable Output<List<S3AuditSourceFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<S3AuditSourceFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(S3AuditSourceFilterArgs... filters) {
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
        public Builder path(@Nullable Output<S3AuditSourcePathArgs> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The location to scan for new data.
         * 
         * @return builder
         * 
         */
        public Builder path(S3AuditSourcePathArgs path) {
            return path(Output.of(path));
        }

        /**
         * @param paused When set to true, the scanner is paused. To disable, set to false.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
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
         * @param scanInterval Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder scanInterval(@Nullable Output<Integer> scanInterval) {
            $.scanInterval = scanInterval;
            return this;
        }

        /**
         * @param scanInterval Time interval in milliseconds of scans for new data. The default is 300000 and the minimum value is 1000 milliseconds.
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

        /**
         * @param url The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](&lt;https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)&gt;).
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The HTTP endpoint to use with [SNS to notify Sumo Logic of new files](&lt;https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Amazon-Web-Services/AWS-S3-Source#Set_up_SNS_in_AWS_(Optional)&gt;).
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public Builder useAutolineMatching(@Nullable Output<Boolean> useAutolineMatching) {
            $.useAutolineMatching = useAutolineMatching;
            return this;
        }

        public Builder useAutolineMatching(Boolean useAutolineMatching) {
            return useAutolineMatching(Output.of(useAutolineMatching));
        }

        public S3AuditSourceState build() {
            return $;
        }
    }

}