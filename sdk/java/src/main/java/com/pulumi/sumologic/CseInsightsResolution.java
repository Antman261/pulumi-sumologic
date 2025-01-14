// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseInsightsResolutionArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseInsightsResolutionState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sumologic CSE Insights Resolution. When an insight gets closed, a resolution indicates why it got closed.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.CseInsightsResolution;
 * import com.pulumi.sumologic.CseInsightsResolutionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var insightsResolution = new CseInsightsResolution(&#34;insightsResolution&#34;, CseInsightsResolutionArgs.builder()        
 *             .description(&#34;New description&#34;)
 *             .parent(&#34;No Action&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Insights Resolution can be imported using the field id, e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cseInsightsResolution:CseInsightsResolution insights_resolution id
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseInsightsResolution:CseInsightsResolution")
public class CseInsightsResolution extends com.pulumi.resources.CustomResource {
    /**
     * The description of the insights resolution.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the insights resolution.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the insights resolution.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the insights resolution.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the built-in parent insights resolution. Supported values: &#34;Resolved&#34;, &#34;False Positive&#34;, &#34;No Action&#34;, &#34;Duplicate&#34;
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The name of the built-in parent insights resolution. Supported values: &#34;Resolved&#34;, &#34;False Positive&#34;, &#34;No Action&#34;, &#34;Duplicate&#34;
     * 
     */
    public Output<Optional<String>> parent() {
        return Codegen.optional(this.parent);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseInsightsResolution(String name) {
        this(name, CseInsightsResolutionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseInsightsResolution(String name, @Nullable CseInsightsResolutionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseInsightsResolution(String name, @Nullable CseInsightsResolutionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseInsightsResolution:CseInsightsResolution", name, args == null ? CseInsightsResolutionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CseInsightsResolution(String name, Output<String> id, @Nullable CseInsightsResolutionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseInsightsResolution:CseInsightsResolution", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CseInsightsResolution get(String name, Output<String> id, @Nullable CseInsightsResolutionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseInsightsResolution(name, id, state, options);
    }
}
