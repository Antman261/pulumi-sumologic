// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevel;
import com.pulumi.sumologic.outputs.HierarchyLevelNextLevelNextLevelNextLevelsWithCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HierarchyLevelNextLevelNextLevel {
    /**
     * @return Indicates the name and type for all entities at this hierarchy level, e.g. service or pod in case of kubernetes entities.
     * 
     */
    private String entityType;
    /**
     * @return Next level without a condition.
     * 
     */
    private @Nullable HierarchyLevelNextLevelNextLevelNextLevel nextLevel;
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    private @Nullable List<HierarchyLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions;

    private HierarchyLevelNextLevelNextLevel() {}
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
    public Optional<HierarchyLevelNextLevelNextLevelNextLevel> nextLevel() {
        return Optional.ofNullable(this.nextLevel);
    }
    /**
     * @return Zero or more next levels with conditions.
     * 
     */
    public List<HierarchyLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions() {
        return this.nextLevelsWithConditions == null ? List.of() : this.nextLevelsWithConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyLevelNextLevelNextLevel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entityType;
        private @Nullable HierarchyLevelNextLevelNextLevelNextLevel nextLevel;
        private @Nullable List<HierarchyLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions;
        public Builder() {}
        public Builder(HierarchyLevelNextLevelNextLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.nextLevel = defaults.nextLevel;
    	      this.nextLevelsWithConditions = defaults.nextLevelsWithConditions;
        }

        @CustomType.Setter
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        @CustomType.Setter
        public Builder nextLevel(@Nullable HierarchyLevelNextLevelNextLevelNextLevel nextLevel) {
            this.nextLevel = nextLevel;
            return this;
        }
        @CustomType.Setter
        public Builder nextLevelsWithConditions(@Nullable List<HierarchyLevelNextLevelNextLevelNextLevelsWithCondition> nextLevelsWithConditions) {
            this.nextLevelsWithConditions = nextLevelsWithConditions;
            return this;
        }
        public Builder nextLevelsWithConditions(HierarchyLevelNextLevelNextLevelNextLevelsWithCondition... nextLevelsWithConditions) {
            return nextLevelsWithConditions(List.of(nextLevelsWithConditions));
        }
        public HierarchyLevelNextLevelNextLevel build() {
            final var o = new HierarchyLevelNextLevelNextLevel();
            o.entityType = entityType;
            o.nextLevel = nextLevel;
            o.nextLevelsWithConditions = nextLevelsWithConditions;
            return o;
        }
    }
}
