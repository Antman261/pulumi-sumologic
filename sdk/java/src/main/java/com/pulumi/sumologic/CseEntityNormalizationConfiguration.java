// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseEntityNormalizationConfigurationArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseEntityNormalizationConfigurationState;
import com.pulumi.sumologic.outputs.CseEntityNormalizationConfigurationDomainMapping;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides the Sumologic CSE Entity Normalization Configuration for the whole organization. There can be only one configuration per organization.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.CseEntityNormalizationConfiguration;
 * import com.pulumi.sumologic.CseEntityNormalizationConfigurationArgs;
 * import com.pulumi.sumologic.inputs.CseEntityNormalizationConfigurationDomainMappingArgs;
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
 *         var entityNormalizationConfiguration = new CseEntityNormalizationConfiguration(&#34;entityNormalizationConfiguration&#34;, CseEntityNormalizationConfigurationArgs.builder()        
 *             .awsNormalizationEnabled(true)
 *             .defaultNormalizedDomain(&#34;domain.com&#34;)
 *             .domainMappings(CseEntityNormalizationConfigurationDomainMappingArgs.builder()
 *                 .normalizedDomain(&#34;normalized.domain&#34;)
 *                 .rawDomain(&#34;raw.domain&#34;)
 *                 .build())
 *             .fqdnNormalizationEnabled(true)
 *             .normalizeHostnames(true)
 *             .normalizeUsernames(true)
 *             .windowsNormalizationEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Entity Normalization Configuration can be imported using the id `cse-entity-normalization-configuration`hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cseEntityNormalizationConfiguration:CseEntityNormalizationConfiguration entity_normalization_configuration cse-entity-normalization-configuration
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseEntityNormalizationConfiguration:CseEntityNormalizationConfiguration")
public class CseEntityNormalizationConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Normalize AWS ARN and Usernames.
     * 
     */
    @Export(name="awsNormalizationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> awsNormalizationEnabled;

    /**
     * @return Normalize AWS ARN and Usernames.
     * 
     */
    public Output<Boolean> awsNormalizationEnabled() {
        return this.awsNormalizationEnabled;
    }
    /**
     * When normalization is configured, at least one domain must be configured and a &#34;Normalized Default Domain&#34; must be provided.
     * 
     */
    @Export(name="defaultNormalizedDomain", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultNormalizedDomain;

    /**
     * @return When normalization is configured, at least one domain must be configured and a &#34;Normalized Default Domain&#34; must be provided.
     * 
     */
    public Output<Optional<String>> defaultNormalizedDomain() {
        return Codegen.optional(this.defaultNormalizedDomain);
    }
    /**
     * Secondary domains.
     * 
     */
    @Export(name="domainMappings", type=List.class, parameters={CseEntityNormalizationConfigurationDomainMapping.class})
    private Output<List<CseEntityNormalizationConfigurationDomainMapping>> domainMappings;

    /**
     * @return Secondary domains.
     * 
     */
    public Output<List<CseEntityNormalizationConfigurationDomainMapping>> domainMappings() {
        return this.domainMappings;
    }
    /**
     * Normalize names in the form user@somedomain.net or hostname.somedomain.net
     * 
     */
    @Export(name="fqdnNormalizationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> fqdnNormalizationEnabled;

    /**
     * @return Normalize names in the form user@somedomain.net or hostname.somedomain.net
     * 
     */
    public Output<Boolean> fqdnNormalizationEnabled() {
        return this.fqdnNormalizationEnabled;
    }
    /**
     * If hostname normalization is enabled.
     * 
     */
    @Export(name="normalizeHostnames", type=Boolean.class, parameters={})
    private Output<Boolean> normalizeHostnames;

    /**
     * @return If hostname normalization is enabled.
     * 
     */
    public Output<Boolean> normalizeHostnames() {
        return this.normalizeHostnames;
    }
    /**
     * If username normalization is enabled.
     * 
     */
    @Export(name="normalizeUsernames", type=Boolean.class, parameters={})
    private Output<Boolean> normalizeUsernames;

    /**
     * @return If username normalization is enabled.
     * 
     */
    public Output<Boolean> normalizeUsernames() {
        return this.normalizeUsernames;
    }
    /**
     * Normalize active directory domains username and hostname formats.
     * 
     */
    @Export(name="windowsNormalizationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> windowsNormalizationEnabled;

    /**
     * @return Normalize active directory domains username and hostname formats.
     * 
     */
    public Output<Boolean> windowsNormalizationEnabled() {
        return this.windowsNormalizationEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseEntityNormalizationConfiguration(String name) {
        this(name, CseEntityNormalizationConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseEntityNormalizationConfiguration(String name, CseEntityNormalizationConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseEntityNormalizationConfiguration(String name, CseEntityNormalizationConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseEntityNormalizationConfiguration:CseEntityNormalizationConfiguration", name, args == null ? CseEntityNormalizationConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CseEntityNormalizationConfiguration(String name, Output<String> id, @Nullable CseEntityNormalizationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseEntityNormalizationConfiguration:CseEntityNormalizationConfiguration", name, state, makeResourceOptions(options, id));
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
    public static CseEntityNormalizationConfiguration get(String name, Output<String> id, @Nullable CseEntityNormalizationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseEntityNormalizationConfiguration(name, id, state, options);
    }
}
