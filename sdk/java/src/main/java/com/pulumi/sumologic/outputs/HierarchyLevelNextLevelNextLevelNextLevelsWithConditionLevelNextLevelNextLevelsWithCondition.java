// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition {
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    private final String condition;
    private final HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level;

    @CustomType.Constructor
    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition(
        @CustomType.Parameter("condition") String condition,
        @CustomType.Parameter("level") HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level) {
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
    public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.level = defaults.level;
        }

        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder level(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }        public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition build() {
            return new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition(condition, level);
        }
    }
}