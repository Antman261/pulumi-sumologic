// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition {
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    private String condition;
    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel level;

    private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition() {}
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    public String condition() {
        return this.condition;
    }
    public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel level() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String condition;
        private HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel level;
        public Builder() {}
        public Builder(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.level = defaults.level;
        }

        @CustomType.Setter
        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        @CustomType.Setter
        public Builder level(HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevel level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }
        public HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition build() {
            final var o = new HierarchyLevelNextLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithCondition();
            o.condition = condition;
            o.level = level;
            return o;
        }
    }
}