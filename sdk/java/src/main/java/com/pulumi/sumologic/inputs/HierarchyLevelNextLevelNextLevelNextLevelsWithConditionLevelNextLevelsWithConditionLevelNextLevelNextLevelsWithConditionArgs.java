// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs;
import java.lang.String;
import java.util.Objects;


public final class HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs Empty = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs();

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
    private Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs> level;

    public Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs> level() {
        return this.level;
    }

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs() {}

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs $) {
        this.condition = $.condition;
        this.level = $.level;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs();
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs defaults) {
            $ = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs(Objects.requireNonNull(defaults));
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

        public Builder level(Output<HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs> level) {
            $.level = level;
            return this;
        }

        public Builder level(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelArgs level) {
            return level(Output.of(level));
        }

        public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionArgs build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.level = Objects.requireNonNull($.level, "expected parameter 'level' to be non-null");
            return $;
        }
    }

}
