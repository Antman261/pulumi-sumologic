// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FieldState extends com.pulumi.resources.ResourceArgs {

    public static final FieldState Empty = new FieldState();

    /**
     * Field type. Possible values are `String`, `Long`, `Int`, `Double`, and `Boolean`.
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    /**
     * @return Field type. Possible values are `String`, `Long`, `Int`, `Double`, and `Boolean`.
     * 
     */
    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * Field identifier.
     * 
     */
    @Import(name="fieldId")
    private @Nullable Output<String> fieldId;

    /**
     * @return Field identifier.
     * 
     */
    public Optional<Output<String>> fieldId() {
        return Optional.ofNullable(this.fieldId);
    }

    /**
     * Name of the field.
     * 
     */
    @Import(name="fieldName")
    private @Nullable Output<String> fieldName;

    /**
     * @return Name of the field.
     * 
     */
    public Optional<Output<String>> fieldName() {
        return Optional.ofNullable(this.fieldName);
    }

    /**
     * State of the field (either `Enabled` or `Disabled`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the field (either `Enabled` or `Disabled`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private FieldState() {}

    private FieldState(FieldState $) {
        this.dataType = $.dataType;
        this.fieldId = $.fieldId;
        this.fieldName = $.fieldName;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldState $;

        public Builder() {
            $ = new FieldState();
        }

        public Builder(FieldState defaults) {
            $ = new FieldState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataType Field type. Possible values are `String`, `Long`, `Int`, `Double`, and `Boolean`.
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType Field type. Possible values are `String`, `Long`, `Int`, `Double`, and `Boolean`.
         * 
         * @return builder
         * 
         */
        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param fieldId Field identifier.
         * 
         * @return builder
         * 
         */
        public Builder fieldId(@Nullable Output<String> fieldId) {
            $.fieldId = fieldId;
            return this;
        }

        /**
         * @param fieldId Field identifier.
         * 
         * @return builder
         * 
         */
        public Builder fieldId(String fieldId) {
            return fieldId(Output.of(fieldId));
        }

        /**
         * @param fieldName Name of the field.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(@Nullable Output<String> fieldName) {
            $.fieldName = fieldName;
            return this;
        }

        /**
         * @param fieldName Name of the field.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(String fieldName) {
            return fieldName(Output.of(fieldName));
        }

        /**
         * @param state State of the field (either `Enabled` or `Disabled`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the field (either `Enabled` or `Disabled`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public FieldState build() {
            return $;
        }
    }

}
