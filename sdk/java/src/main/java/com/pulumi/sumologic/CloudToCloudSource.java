// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.CloudToCloudSourceArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.CloudToCloudSourceState;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a [Sumologic Cloud-to-Cloud source][1].
 * 
 * ## Supported Integrations
 * 
 * List of available integrations along with their corresponding `JSON` templates is present [here](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Cloud-to-Cloud_Integration_Framework#Integrations)
 * 
 * __IMPORTANT:__ The API credentials are stored in plain-text in the state. This is a potential security issue.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.sumologic.Collector;
 * import com.pulumi.sumologic.CollectorArgs;
 * import com.pulumi.sumologic.CloudToCloudSource;
 * import com.pulumi.sumologic.CloudToCloudSourceArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var collector = new Collector(&#34;collector&#34;, CollectorArgs.builder()        
 *             .description(&#34;Just testing this&#34;)
 *             .build());
 * 
 *         var oktaSource = new CloudToCloudSource(&#34;oktaSource&#34;, CloudToCloudSourceArgs.builder()        
 *             .collectorId(collector.id())
 *             .schemaRef(Map.of(&#34;type&#34;, &#34;Okta&#34;))
 *             .config(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;name&#34;, &#34;okta source&#34;),
 *                     jsonProperty(&#34;domain&#34;, &#34;dev-xxx-admin.okta.com&#34;),
 *                     jsonProperty(&#34;collectAll&#34;, true),
 *                     jsonProperty(&#34;apiKey&#34;, &#34;xxx&#34;),
 *                     jsonProperty(&#34;fields&#34;, jsonObject(
 *                         jsonProperty(&#34;_siemForward&#34;, false)
 *                     )),
 *                     jsonProperty(&#34;pollingInterval&#34;, 30)
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud-to-Cloud sources can be imported using the collector and source IDs (`collector/source`), e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cloudToCloudSource:CloudToCloudSource test 100000001/100000001
 * ```
 * 
 *  Cloud-to-Cloud sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/cloudToCloudSource:CloudToCloudSource test my-test-collector/my-test-source
 * ```
 * 
 *  [1]https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Cloud-to-Cloud_Integration_Framework [2]https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Cloud-to-Cloud_Integration_Framework#Integrations
 * 
 */
@ResourceType(type="sumologic:index/cloudToCloudSource:CloudToCloudSource")
public class CloudToCloudSource extends com.pulumi.resources.CustomResource {
    @Export(name="collectorId", type=Integer.class, parameters={})
    private Output<Integer> collectorId;

    public Output<Integer> collectorId() {
        return this.collectorId;
    }
    /**
     * This is a JSON object which contains the configuration parameters for the Source.
     * 
     */
    @Export(name="config", type=String.class, parameters={})
    private Output<String> config;

    /**
     * @return This is a JSON object which contains the configuration parameters for the Source.
     * 
     */
    public Output<String> config() {
        return this.config;
    }
    /**
     * Source schema details.
     * 
     */
    @Export(name="schemaRef", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> schemaRef;

    /**
     * @return Source schema details.
     * 
     */
    public Output<Map<String,String>> schemaRef() {
        return this.schemaRef;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudToCloudSource(String name) {
        this(name, CloudToCloudSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudToCloudSource(String name, CloudToCloudSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudToCloudSource(String name, CloudToCloudSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cloudToCloudSource:CloudToCloudSource", name, args == null ? CloudToCloudSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudToCloudSource(String name, Output<String> id, @Nullable CloudToCloudSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/cloudToCloudSource:CloudToCloudSource", name, state, makeResourceOptions(options, id));
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
    public static CloudToCloudSource get(String name, Output<String> id, @Nullable CloudToCloudSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudToCloudSource(name, id, state, options);
    }
}