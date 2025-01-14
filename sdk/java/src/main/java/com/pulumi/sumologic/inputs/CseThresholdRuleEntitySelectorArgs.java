// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CseThresholdRuleEntitySelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseThresholdRuleEntitySelectorArgs Empty = new CseThresholdRuleEntitySelectorArgs();

    @Import(name="entityType", required=true)
    private Output<String> entityType;

    public Output<String> entityType() {
        return this.entityType;
    }

    /**
     * The expression for which records to match on
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return The expression for which records to match on
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    private CseThresholdRuleEntitySelectorArgs() {}

    private CseThresholdRuleEntitySelectorArgs(CseThresholdRuleEntitySelectorArgs $) {
        this.entityType = $.entityType;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseThresholdRuleEntitySelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseThresholdRuleEntitySelectorArgs $;

        public Builder() {
            $ = new CseThresholdRuleEntitySelectorArgs();
        }

        public Builder(CseThresholdRuleEntitySelectorArgs defaults) {
            $ = new CseThresholdRuleEntitySelectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityType(Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        /**
         * @param expression The expression for which records to match on
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The expression for which records to match on
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public CseThresholdRuleEntitySelectorArgs build() {
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
