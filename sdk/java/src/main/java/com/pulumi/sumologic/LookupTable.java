// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.LookupTableArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.LookupTableState;
import com.pulumi.sumologic.outputs.LookupTableField;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a [Sumologic Lookup Table](https://help.sumologic.com/05Search/Lookup_Tables).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.LookupTable;
 * import com.pulumi.sumologic.LookupTableArgs;
 * import com.pulumi.sumologic.inputs.LookupTableFieldArgs;
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
 *         var lookupTable = new LookupTable(&#34;lookupTable&#34;, LookupTableArgs.builder()        
 *             .description(&#34;some description&#34;)
 *             .fields(            
 *                 LookupTableFieldArgs.builder()
 *                     .fieldName(&#34;FieldName1&#34;)
 *                     .fieldType(&#34;boolean&#34;)
 *                     .build(),
 *                 LookupTableFieldArgs.builder()
 *                     .fieldName(&#34;FieldName2&#34;)
 *                     .fieldType(&#34;string&#34;)
 *                     .build())
 *             .parentFolderId(&#34;&lt;personal folder id&gt;&#34;)
 *             .primaryKeys(&#34;FieldName1&#34;)
 *             .sizeLimitAction(&#34;DeleteOldData&#34;)
 *             .ttl(100)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Attributes reference
 * 
 * The following attributes are exported:
 * 
 * - `id` - Unique identifier for the partition.
 * 
 * ## Import
 * 
 * Lookup Tables can be imported using the id, e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/lookupTable:LookupTable test 1234567890
 * ```
 * 
 *  [1]https://help.sumologic.com/05Search/Lookup_Tables
 * 
 */
@ResourceType(type="sumologic:index/lookupTable:LookupTable")
public class LookupTable extends com.pulumi.resources.CustomResource {
    /**
     * The description of the lookup table.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the lookup table.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The list of fields in the lookup table.
     * 
     */
    @Export(name="fields", type=List.class, parameters={LookupTableField.class})
    private Output</* @Nullable */ List<LookupTableField>> fields;

    /**
     * @return The list of fields in the lookup table.
     * 
     */
    public Output<Optional<List<LookupTableField>>> fields() {
        return Codegen.optional(this.fields);
    }
    /**
     * The name of the lookup table.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the lookup table.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parent-folder-path identifier of the lookup table in the Library.
     * 
     */
    @Export(name="parentFolderId", type=String.class, parameters={})
    private Output</* @Nullable */ String> parentFolderId;

    /**
     * @return The parent-folder-path identifier of the lookup table in the Library.
     * 
     */
    public Output<Optional<String>> parentFolderId() {
        return Codegen.optional(this.parentFolderId);
    }
    /**
     * The primary key field names.
     * 
     */
    @Export(name="primaryKeys", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> primaryKeys;

    /**
     * @return The primary key field names.
     * 
     */
    public Output<Optional<List<String>>> primaryKeys() {
        return Codegen.optional(this.primaryKeys);
    }
    @Export(name="sizeLimitAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> sizeLimitAction;

    public Output<Optional<String>> sizeLimitAction() {
        return Codegen.optional(this.sizeLimitAction);
    }
    /**
     * A time to live for each entry in the lookup table (in minutes). 365 days is the maximum time to live for each entry that you can specify. Setting it to 0 means that the records will not expire automatically.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return A time to live for each entry in the lookup table (in minutes). 365 days is the maximum time to live for each entry that you can specify. Setting it to 0 means that the records will not expire automatically.
     * 
     */
    public Output<Optional<Integer>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LookupTable(String name) {
        this(name, LookupTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LookupTable(String name, LookupTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LookupTable(String name, LookupTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/lookupTable:LookupTable", name, args == null ? LookupTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LookupTable(String name, Output<String> id, @Nullable LookupTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/lookupTable:LookupTable", name, state, makeResourceOptions(options, id));
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
    public static LookupTable get(String name, Output<String> id, @Nullable LookupTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LookupTable(name, id, state, options);
    }
}
