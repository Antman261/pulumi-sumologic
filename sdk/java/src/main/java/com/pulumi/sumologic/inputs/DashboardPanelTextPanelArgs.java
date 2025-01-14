// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardPanelTextPanelArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardPanelTextPanelArgs Empty = new DashboardPanelTextPanelArgs();

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="keepVisualSettingsConsistentWithParent")
    private @Nullable Output<Boolean> keepVisualSettingsConsistentWithParent;

    public Optional<Output<Boolean>> keepVisualSettingsConsistentWithParent() {
        return Optional.ofNullable(this.keepVisualSettingsConsistentWithParent);
    }

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="text")
    private @Nullable Output<String> text;

    public Optional<Output<String>> text() {
        return Optional.ofNullable(this.text);
    }

    /**
     * Title of the dashboard.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Title of the dashboard.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="visualSettings")
    private @Nullable Output<String> visualSettings;

    public Optional<Output<String>> visualSettings() {
        return Optional.ofNullable(this.visualSettings);
    }

    private DashboardPanelTextPanelArgs() {}

    private DashboardPanelTextPanelArgs(DashboardPanelTextPanelArgs $) {
        this.id = $.id;
        this.keepVisualSettingsConsistentWithParent = $.keepVisualSettingsConsistentWithParent;
        this.key = $.key;
        this.text = $.text;
        this.title = $.title;
        this.visualSettings = $.visualSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardPanelTextPanelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardPanelTextPanelArgs $;

        public Builder() {
            $ = new DashboardPanelTextPanelArgs();
        }

        public Builder(DashboardPanelTextPanelArgs defaults) {
            $ = new DashboardPanelTextPanelArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder keepVisualSettingsConsistentWithParent(@Nullable Output<Boolean> keepVisualSettingsConsistentWithParent) {
            $.keepVisualSettingsConsistentWithParent = keepVisualSettingsConsistentWithParent;
            return this;
        }

        public Builder keepVisualSettingsConsistentWithParent(Boolean keepVisualSettingsConsistentWithParent) {
            return keepVisualSettingsConsistentWithParent(Output.of(keepVisualSettingsConsistentWithParent));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder text(@Nullable Output<String> text) {
            $.text = text;
            return this;
        }

        public Builder text(String text) {
            return text(Output.of(text));
        }

        /**
         * @param title Title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public Builder visualSettings(@Nullable Output<String> visualSettings) {
            $.visualSettings = visualSettings;
            return this;
        }

        public Builder visualSettings(String visualSettings) {
            return visualSettings(Output.of(visualSettings));
        }

        public DashboardPanelTextPanelArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
