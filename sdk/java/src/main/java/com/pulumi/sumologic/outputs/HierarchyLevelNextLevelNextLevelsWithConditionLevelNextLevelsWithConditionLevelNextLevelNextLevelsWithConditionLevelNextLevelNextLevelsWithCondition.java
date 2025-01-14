// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition {
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    private String condition;
    private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level;

    private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition() {}
    /**
     * @return Condition to be checked against for level.entityType value, for now full string match.
     * 
     */
    public String condition() {
        return this.condition;
    }
    public HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String condition;
        private HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level;
        public Builder() {}
        public Builder(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition defaults) {
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
        public Builder level(HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevel level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }
        public HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition build() {
            final var o = new HierarchyLevelNextLevelNextLevelsWithConditionLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithConditionLevelNextLevelNextLevelsWithCondition();
            o.condition = condition;
            o.level = level;
            return o;
        }
    }
}
