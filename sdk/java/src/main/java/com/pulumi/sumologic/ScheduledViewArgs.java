// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledViewArgs Empty = new ScheduledViewArgs();

    /**
     * An optional ID of a data forwarding configuration to be used by the scheduled view.
     * 
     */
    @Import(name="dataForwardingId")
    private @Nullable Output<String> dataForwardingId;

    /**
     * @return An optional ID of a data forwarding configuration to be used by the scheduled view.
     * 
     */
    public Optional<Output<String>> dataForwardingId() {
        return Optional.ofNullable(this.dataForwardingId);
    }

    /**
     * Name of the index (scheduled view).
     * 
     */
    @Import(name="indexName", required=true)
    private Output<String> indexName;

    /**
     * @return Name of the index (scheduled view).
     * 
     */
    public Output<String> indexName() {
        return this.indexName;
    }

    /**
     * Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
     * 
     */
    @Import(name="parsingMode")
    private @Nullable Output<String> parsingMode;

    /**
     * @return Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
     * 
     */
    public Optional<Output<String>> parsingMode() {
        return Optional.ofNullable(this.parsingMode);
    }

    /**
     * Log query defining the scheduled view.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return Log query defining the scheduled view.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
     * 
     */
    @Import(name="reduceRetentionPeriodImmediately")
    private @Nullable Output<Boolean> reduceRetentionPeriodImmediately;

    /**
     * @return This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
     * 
     */
    public Optional<Output<Boolean>> reduceRetentionPeriodImmediately() {
        return Optional.ofNullable(this.reduceRetentionPeriodImmediately);
    }

    /**
     * The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
     * 
     */
    @Import(name="retentionPeriod")
    private @Nullable Output<Integer> retentionPeriod;

    /**
     * @return The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
     * 
     */
    public Optional<Output<Integer>> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }

    /**
     * Start timestamp in UTC in RFC3339 format.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<String> startTime;

    /**
     * @return Start timestamp in UTC in RFC3339 format.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }

    private ScheduledViewArgs() {}

    private ScheduledViewArgs(ScheduledViewArgs $) {
        this.dataForwardingId = $.dataForwardingId;
        this.indexName = $.indexName;
        this.parsingMode = $.parsingMode;
        this.query = $.query;
        this.reduceRetentionPeriodImmediately = $.reduceRetentionPeriodImmediately;
        this.retentionPeriod = $.retentionPeriod;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledViewArgs $;

        public Builder() {
            $ = new ScheduledViewArgs();
        }

        public Builder(ScheduledViewArgs defaults) {
            $ = new ScheduledViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataForwardingId An optional ID of a data forwarding configuration to be used by the scheduled view.
         * 
         * @return builder
         * 
         */
        public Builder dataForwardingId(@Nullable Output<String> dataForwardingId) {
            $.dataForwardingId = dataForwardingId;
            return this;
        }

        /**
         * @param dataForwardingId An optional ID of a data forwarding configuration to be used by the scheduled view.
         * 
         * @return builder
         * 
         */
        public Builder dataForwardingId(String dataForwardingId) {
            return dataForwardingId(Output.of(dataForwardingId));
        }

        /**
         * @param indexName Name of the index (scheduled view).
         * 
         * @return builder
         * 
         */
        public Builder indexName(Output<String> indexName) {
            $.indexName = indexName;
            return this;
        }

        /**
         * @param indexName Name of the index (scheduled view).
         * 
         * @return builder
         * 
         */
        public Builder indexName(String indexName) {
            return indexName(Output.of(indexName));
        }

        /**
         * @param parsingMode Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
         * 
         * @return builder
         * 
         */
        public Builder parsingMode(@Nullable Output<String> parsingMode) {
            $.parsingMode = parsingMode;
            return this;
        }

        /**
         * @param parsingMode Default to `Manual`. Define the parsing mode to scan the JSON format log messages. Possible values are: `AutoParse` - In AutoParse mode, the system automatically figures out fields to parse based on the search query. `Manual` - While in the Manual mode, no fields are parsed out automatically. For more information see Dynamic Parsing.
         * 
         * @return builder
         * 
         */
        public Builder parsingMode(String parsingMode) {
            return parsingMode(Output.of(parsingMode));
        }

        /**
         * @param query Log query defining the scheduled view.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Log query defining the scheduled view.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param reduceRetentionPeriodImmediately This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
         * 
         * @return builder
         * 
         */
        public Builder reduceRetentionPeriodImmediately(@Nullable Output<Boolean> reduceRetentionPeriodImmediately) {
            $.reduceRetentionPeriodImmediately = reduceRetentionPeriodImmediately;
            return this;
        }

        /**
         * @param reduceRetentionPeriodImmediately This is required on update if the newly specified retention period is less than the existing retention period. In such a situation, a value of true says that data between the existing retention period and the new retention period should be deleted immediately; if false, such data will be deleted after seven days. This property is optional and ignored if the specified retentionPeriod is greater than or equal to the current retention period.
         * 
         * @return builder
         * 
         */
        public Builder reduceRetentionPeriodImmediately(Boolean reduceRetentionPeriodImmediately) {
            return reduceRetentionPeriodImmediately(Output.of(reduceRetentionPeriodImmediately));
        }

        /**
         * @param retentionPeriod The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriod(@Nullable Output<Integer> retentionPeriod) {
            $.retentionPeriod = retentionPeriod;
            return this;
        }

        /**
         * @param retentionPeriod The number of days to retain data in the scheduled view, or -1 to use the default value for your account. Only relevant if your account has multi-retention. enabled.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriod(Integer retentionPeriod) {
            return retentionPeriod(Output.of(retentionPeriod));
        }

        /**
         * @param startTime Start timestamp in UTC in RFC3339 format.
         * 
         * @return builder
         * 
         */
        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Start timestamp in UTC in RFC3339 format.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ScheduledViewArgs build() {
            $.indexName = Objects.requireNonNull($.indexName, "expected parameter 'indexName' to be non-null");
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
