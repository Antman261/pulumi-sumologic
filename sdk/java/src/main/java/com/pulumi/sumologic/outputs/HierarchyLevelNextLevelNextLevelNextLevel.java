// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevel;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HierarchyLevelNextLevelNextLevelNextLevel {
    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    private final String entityType;
    /**
     * @return Next level without a condition.
     * 
     */
    private final @Nullable HierarchyLevelNextLevelNextLevelNextLevelNextLevel nextLevel;
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    private final @Nullable List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions;

    @CustomType.Constructor
    private HierarchyLevelNextLevelNextLevelNextLevel(
        @CustomType.Parameter("entityType") String entityType,
        @CustomType.Parameter("nextLevel") @Nullable HierarchyLevelNextLevelNextLevelNextLevelNextLevel nextLevel,
        @CustomType.Parameter("nextLevelsWithConditions") @Nullable List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions) {
        this.entityType = entityType;
        this.nextLevel = nextLevel;
        this.nextLevelsWithConditions = nextLevelsWithConditions;
    }

    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    public String entityType() {
        return this.entityType;
    }
    /**
     * @return Next level without a condition.
     * 
     */
    public Optional<HierarchyLevelNextLevelNextLevelNextLevelNextLevel> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions() {
        return this.nextLevelsWithConditions == null ? List.of() : this.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevelNextLevel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityType;
        private @Nullable HierarchyLevelNextLevelNextLevelNextLevelNextLevel nextLevel;
        private @Nullable List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyLevelNextLevelNextLevelNextLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.nextLevel = defaults.nextLevel;
    	      this.nextLevelsWithConditions = defaults.nextLevelsWithConditions;
        }

        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder nextLevel(@Nullable HierarchyLevelNextLevelNextLevelNextLevelNextLevel nextLevel) {
            this.nextLevel = nextLevel;
            return this;
        }
        public Builder nextLevelsWithConditions(@Nullable List<HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions) {
            this.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelNextLevelNextLevelNextLevelsWithCondition... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }        public HierarchyLevelNextLevelNextLevelNextLevel build() {
            return new HierarchyLevelNextLevelNextLevelNextLevel(entityType, nextLevel, nextLevelsWithConditions);
        }
    }
}