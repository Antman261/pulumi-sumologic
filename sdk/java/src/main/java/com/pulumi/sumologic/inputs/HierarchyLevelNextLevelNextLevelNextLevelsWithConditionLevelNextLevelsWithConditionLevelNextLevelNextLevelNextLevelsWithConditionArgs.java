// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs;
import java.lang.String;
import java.util.Objects;


public final class HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs Empty = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs();

    /**
     * Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    @Import(name="condition", required=true)
    private Output<String> condition;

    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    public Output<String> condition() {
        return this.condition;
    }

    @Import(name="level", required=true)
    private Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs> level;

    public Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs> level() {
        return this.level;
    }

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs() {}

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs $) {
        this.condition = $.condition;
        this.level = $.level;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs();
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs defaults) {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition Condition to be checked against for level.entityType value, for now full string match.
         * 
         * @return builder
         * 
         */
        public Builder condition(Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition Condition to be checked against for level.entityType value, for now full string match.
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        public Builder level(Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs> level) {
            $.level = level;
            return this;
        }

        public Builder level(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevelArgs level) {
            return level(Output.of(level));
        }

        public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionArgs build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.level = Objects.requireNonNull($.level, "expected parameter 'level' to be non-null");
            return $;
        }
    }

}
