// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.sumologic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.sumologic.GcpSourceArgs;
import com.pulumi.sumologic.Utilities;
import com.pulumi.sumologic.inputs.GcpSourceState;
import com.pulumi.sumologic.outputs.GcpSourceAuthentication;
import com.pulumi.sumologic.outputs.GcpSourceDefaultDateFormat;
import com.pulumi.sumologic.outputs.GcpSourceFilter;
import com.pulumi.sumologic.outputs.GcpSourcePath;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a [Sumo Logic Google Cloud Platform Source](https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Google-Cloud-Platform-Source).
 * 
 * ***Note:*** Google no longer requires a pub/sub domain to be [verified](https://cloud.google.com/pubsub/docs/push). You no longer have to set up domain verification with your GCP Source endpoint.
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
 * import com.pulumi.sumologic.GcpSource;
 * import com.pulumi.sumologic.GcpSourceArgs;
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
 *         var gcpSource = new GcpSource(&#34;gcpSource&#34;, GcpSourceArgs.builder()        
 *             .category(&#34;gcp&#34;)
 *             .collectorId(collector.id())
 *             .description(&#34;My description&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Sumo Logic Google Cloud Platform sources can be imported using the collector and source IDs (`collector/source`), e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/gcpSource:GcpSource test 100000001/100000001
 * ```
 * 
 *  Sumo Logic Google Cloud Platform sources can be imported using the collector name and source name (`collectorName/sourceName`), e.g.hcl
 * 
 * ```sh
 *  $ pulumi import sumologic:index/gcpSource:GcpSource test my-test-collector/my-test-source
 * ```
 * 
 *  [1]https://help.sumologic.com/Send_Data/Sources/03Use_JSON_to_Configure_Sources/JSON_Parameters_for_Hosted_Sources [2]https://help.sumologic.com/03Send-Data/Sources/02Sources-for-Hosted-Collectors/Google-Cloud-Platform-Source [3]https://cloud.google.com/pubsub/docs/push
 * 
 */
@ResourceType(type="sumologic:index/gcpSource:GcpSource")
public class GcpSource extends com.pulumi.resources.CustomResource {
    @Export(name="authentication", type=GcpSourceAuthentication.class, parameters={})
    private Output</* @Nullable */ GcpSourceAuthentication> authentication;

    public Output<Optional<GcpSourceAuthentication>> authentication() {
        return Codegen.optional(this.authentication);
    }
    @Export(name="automaticDateParsing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automaticDateParsing;

    public Output<Optional<Boolean>> automaticDateParsing() {
        return Codegen.optional(this.automaticDateParsing);
    }
    @Export(name="category", type=String.class, parameters={})
    private Output</* @Nullable */ String> category;

    public Output<Optional<String>> category() {
        return Codegen.optional(this.category);
    }
    @Export(name="collectorId", type=Integer.class, parameters={})
    private Output<Integer> collectorId;

    public Output<Integer> collectorId() {
        return this.collectorId;
    }
    @Export(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    public Output<Optional<String>> contentType() {
        return Codegen.optional(this.contentType);
    }
    @Export(name="cutoffRelativeTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> cutoffRelativeTime;

    public Output<Optional<String>> cutoffRelativeTime() {
        return Codegen.optional(this.cutoffRelativeTime);
    }
    @Export(name="cutoffTimestamp", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cutoffTimestamp;

    public Output<Optional<Integer>> cutoffTimestamp() {
        return Codegen.optional(this.cutoffTimestamp);
    }
    @Export(name="defaultDateFormats", type=List.class, parameters={GcpSourceDefaultDateFormat.class})
    private Output</* @Nullable */ List<GcpSourceDefaultDateFormat>> defaultDateFormats;

    public Output<Optional<List<GcpSourceDefaultDateFormat>>> defaultDateFormats() {
        return Codegen.optional(this.defaultDateFormats);
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="fields", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> fields;

    public Output<Optional<Map<String,String>>> fields() {
        return Codegen.optional(this.fields);
    }
    @Export(name="filters", type=List.class, parameters={GcpSourceFilter.class})
    private Output</* @Nullable */ List<GcpSourceFilter>> filters;

    public Output<Optional<List<GcpSourceFilter>>> filters() {
        return Codegen.optional(this.filters);
    }
    @Export(name="forceTimezone", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceTimezone;

    public Output<Optional<Boolean>> forceTimezone() {
        return Codegen.optional(this.forceTimezone);
    }
    @Export(name="hostName", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostName;

    public Output<Optional<String>> hostName() {
        return Codegen.optional(this.hostName);
    }
    @Export(name="manualPrefixRegexp", type=String.class, parameters={})
    private Output</* @Nullable */ String> manualPrefixRegexp;

    public Output<Optional<String>> manualPrefixRegexp() {
        return Codegen.optional(this.manualPrefixRegexp);
    }
    @Export(name="messagePerRequest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> messagePerRequest;

    public Output<Optional<Boolean>> messagePerRequest() {
        return Codegen.optional(this.messagePerRequest);
    }
    @Export(name="multilineProcessingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> multilineProcessingEnabled;

    public Output<Optional<Boolean>> multilineProcessingEnabled() {
        return Codegen.optional(this.multilineProcessingEnabled);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="path", type=GcpSourcePath.class, parameters={})
    private Output</* @Nullable */ GcpSourcePath> path;

    public Output<Optional<GcpSourcePath>> path() {
        return Codegen.optional(this.path);
    }
    @Export(name="timezone", type=String.class, parameters={})
    private Output</* @Nullable */ String> timezone;

    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }
    /**
     * The HTTP endpoint to use for sending data to this source.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The HTTP endpoint to use for sending data to this source.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    @Export(name="useAutolineMatching", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useAutolineMatching;

    public Output<Optional<Boolean>> useAutolineMatching() {
        return Codegen.optional(this.useAutolineMatching);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GcpSource(String name) {
        this(name, GcpSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GcpSource(String name, GcpSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GcpSource(String name, GcpSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/gcpSource:GcpSource", name, args == null ? GcpSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GcpSource(String name, Output<String> id, @Nullable GcpSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("sumologic:index/gcpSource:GcpSource", name, state, makeResourceOptions(options, id));
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
    public static GcpSource get(String name, Output<String> id, @Nullable GcpSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GcpSource(name, id, state, options);
    }
}
