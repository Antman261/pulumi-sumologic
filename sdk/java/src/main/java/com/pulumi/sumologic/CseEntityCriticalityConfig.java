// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseEntityCriticalityConfigArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseEntityCriticalityConfigState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Sumologic CSE Entity Criticality Configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.CseEntityCriticalityConfig;
 * import com.pulumi.sumologic.CseEntityCriticalityConfigArgs;
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
 *         var entityCriticalityConfig = new CseEntityCriticalityConfig(&#34;entityCriticalityConfig&#34;, CseEntityCriticalityConfigArgs.builder()        
 *             .severityExpression(&#34;severity + 2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Entity criticality configuration can be imported using the field id, e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cseEntityCriticalityConfig:CseEntityCriticalityConfig entity_criticality_config id
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseEntityCriticalityConfig:CseEntityCriticalityConfig")
public class CseEntityCriticalityConfig extends com.pulumi.resources.CustomResource {
    /**
     * Human friendly and unique name. Examples: &#34;Executive Laptop&#34;, &#34;Bastion Host&#34;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Human friendly and unique name. Examples: &#34;Executive Laptop&#34;, &#34;Bastion Host&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Algebraic expression representing this entity\&#39;s criticality. Examples: &#34;severity * 2&#34;, &#34;severity - 5&#34;, &#34;severity / 3&#34;.
     * 
     */
    @Export(name="severityExpression", type=String.class, parameters={})
    private Output<String> severityExpression;

    /**
     * @return Algebraic expression representing this entity\&#39;s criticality. Examples: &#34;severity * 2&#34;, &#34;severity - 5&#34;, &#34;severity / 3&#34;.
     * 
     */
    public Output<String> severityExpression() {
        return this.severityExpression;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseEntityCriticalityConfig(String name) {
        this(name, CseEntityCriticalityConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseEntityCriticalityConfig(String name, CseEntityCriticalityConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseEntityCriticalityConfig(String name, CseEntityCriticalityConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseEntityCriticalityConfig:CseEntityCriticalityConfig", name, args == null ? CseEntityCriticalityConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CseEntityCriticalityConfig(String name, Output<String> id, @Nullable CseEntityCriticalityConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseEntityCriticalityConfig:CseEntityCriticalityConfig", name, state, makeResourceOptions(options, id));
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
    public static CseEntityCriticalityConfig get(String name, Output<String> id, @Nullable CseEntityCriticalityConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseEntityCriticalityConfig(name, id, state, options);
    }
}
