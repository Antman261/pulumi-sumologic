// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition {
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    private final String condition;
    private final HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level;

    @CustomType.Constructor
    private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition(
        @CustomType.Parameter("condition") String condition,
        @CustomType.Parameter("level") HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level) {
        this.condition = condition;
        this.level = level;
    }

    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    public String condition() {
        return this.condition;
    }
    public HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.level = defaults.level;
        }

        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder level(HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithConditionLevel level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }        public HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition build() {
            return new HierarchyLevelNextLevelsWithConditionLevelNextLevelNextLevelNextLevelsWithCondition(condition, level);
        }
    }
}