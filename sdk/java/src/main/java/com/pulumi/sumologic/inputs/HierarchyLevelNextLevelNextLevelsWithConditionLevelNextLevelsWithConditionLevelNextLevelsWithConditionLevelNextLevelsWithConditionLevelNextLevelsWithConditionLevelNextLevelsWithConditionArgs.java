// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.sumologic.inputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs;
import java.lang.String;
import java.util.Objects;


public final class HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs Empty = new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs();

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
    private Output<HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs> level;

    public Output<HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs> level() {
        return this.level;
    }

    private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs() {}

    private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs $) {
        this.condition = $.condition;
        this.level = $.level;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs $;

        public Builder() {
            $ = new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs();
        }

        public Builder(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs defaults) {
            $ = new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs(Objects.requireNonNull(defaults));
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

        public Builder level(Output<HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs> level) {
            $.level = level;
            return this;
        }

        public Builder level(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelArgs level) {
            return level(Output.of(level));
        }

        public HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelsWithConditionArgs build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.level = Objects.requireNonNull($.level, "expected parameter 'level' to be non-null");
            return $;
        }
    }

}
