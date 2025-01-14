// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class CseChainRuleExpressionsAndLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final CseChainRuleExpressionsAndLimitArgs Empty = new CseChainRuleExpressionsAndLimitArgs();

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

    /**
     * How many times this expression must match for the Signal to fire
     * 
     */
    @Import(name="limit", required=true)
    private Output<Integer> limit;

    /**
     * @return How many times this expression must match for the Signal to fire
     * 
     */
    public Output<Integer> limit() {
        return this.limit;
    }

    private CseChainRuleExpressionsAndLimitArgs() {}

    private CseChainRuleExpressionsAndLimitArgs(CseChainRuleExpressionsAndLimitArgs $) {
        this.expression = $.expression;
        this.limit = $.limit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CseChainRuleExpressionsAndLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CseChainRuleExpressionsAndLimitArgs $;

        public Builder() {
            $ = new CseChainRuleExpressionsAndLimitArgs();
        }

        public Builder(CseChainRuleExpressionsAndLimitArgs defaults) {
            $ = new CseChainRuleExpressionsAndLimitArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param limit How many times this expression must match for the Signal to fire
         * 
         * @return builder
         * 
         */
        public Builder limit(Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit How many times this expression must match for the Signal to fire
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        public CseChainRuleExpressionsAndLimitArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.limit = Objects.requireNonNull($.limit, "expected parameter 'limit' to be non-null");
            return $;
        }
    }

}
