// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCollectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCollectorArgs Empty = new GetCollectorArgs();

    @Import(name="id")
    private @Nullable Output<Integer> id;

    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetCollectorArgs() {}

    private GetCollectorArgs(GetCollectorArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCollectorArgs $;

        public Builder() {
            $ = new GetCollectorArgs();
        }

        public Builder(GetCollectorArgs defaults) {
            $ = new GetCollectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetCollectorArgs build() {
            return $;
        }
    }

}