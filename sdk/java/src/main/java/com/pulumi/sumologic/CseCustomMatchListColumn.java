// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CseCustomMatchListColumnArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CseCustomMatchListColumnState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Sumologic CSE Custom Match List Column.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.CseCustomMatchListColumn;
 * import com.pulumi.sumologic.CseCustomMatchListColumnArgs;
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
 *         var customMatchListColumn = new CseCustomMatchListColumn(&#34;customMatchListColumn&#34;, CseCustomMatchListColumnArgs.builder()        
 *             .fields(&#34;srcDevice_ip&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Custom Match List Column can be imported using the field id, e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cseCustomMatchListColumn:CseCustomMatchListColumn custom_match_list_column id
 * ```
 * 
 */
@ResourceType(type="sumologic:index/cseCustomMatchListColumn:CseCustomMatchListColumn")
public class CseCustomMatchListColumn extends com.pulumi.resources.CustomResource {
    /**
     * Custom Match List Column fields.
     * 
     */
    @Export(name="fields", type=List.class, parameters={String.class})
    private Output<List<String>> fields;

    /**
     * @return Custom Match List Column fields.
     * 
     */
    public Output<List<String>> fields() {
        return this.fields;
    }
    /**
     * Custom Match List Column name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Custom Match List Column name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CseCustomMatchListColumn(String name) {
        this(name, CseCustomMatchListColumnArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CseCustomMatchListColumn(String name, CseCustomMatchListColumnArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CseCustomMatchListColumn(String name, CseCustomMatchListColumnArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseCustomMatchListColumn:CseCustomMatchListColumn", name, args == null ? CseCustomMatchListColumnArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CseCustomMatchListColumn(String name, Output<String> id, @Nullable CseCustomMatchListColumnState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cseCustomMatchListColumn:CseCustomMatchListColumn", name, state, makeResourceOptions(options, id));
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
    public static CseCustomMatchListColumn get(String name, Output<String> id, @Nullable CseCustomMatchListColumnState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CseCustomMatchListColumn(name, id, state, options);
    }
}
