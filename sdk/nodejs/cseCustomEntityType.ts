// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Sumologic CSE Custom Entity Type.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as sumologic from "@pulumi/sumologic";
 *
 * const customEntityType = new sumologic.CseCustomEntityType("custom_entity_type", {
 *     fields: [
 *         "file_hash_md5",
 *         "file_hash_sha1",
 *     ],
 *     identifier: "identifier",
 * });
 * ```
 * ## Argument reference
 *
 * The following arguments are supported:
 *
 * - `name` - (Required) Human friend and unique name. Example: "File Hash".
 * - `identifier` - (Required) Machine friendly and unique identifier. Example: "filehash".
 * - `fields` - (Required) Record schema fields. Examples: "fileHashMd5", "fileHashSha1".".
 *
 * The following attributes are exported:
 *
 * - `id` - The internal ID of the custom entity type.
 *
 * ## Import
 *
 * Custom entity type can be imported using the field id, e.g.hcl
 *
 * ```sh
 *  $ pulumi import sumologic:index/cseCustomEntityType:CseCustomEntityType custom_entity_type id
 * ```
 */
export class CseCustomEntityType extends pulumi.CustomResource {
    /**
     * Get an existing CseCustomEntityType resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CseCustomEntityTypeState, opts?: pulumi.CustomResourceOptions): CseCustomEntityType {
        return new CseCustomEntityType(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'sumologic:index/cseCustomEntityType:CseCustomEntityType';

    /**
     * Returns true if the given object is an instance of CseCustomEntityType.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CseCustomEntityType {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CseCustomEntityType.__pulumiType;
    }

    public readonly fields!: pulumi.Output<string[]>;
    public readonly identifier!: pulumi.Output<string>;
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a CseCustomEntityType resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CseCustomEntityTypeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CseCustomEntityTypeArgs | CseCustomEntityTypeState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CseCustomEntityTypeState | undefined;
            inputs["fields"] = state ? state.fields : undefined;
            inputs["identifier"] = state ? state.identifier : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as CseCustomEntityTypeArgs | undefined;
            if ((!args || args.fields === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fields'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            inputs["fields"] = args ? args.fields : undefined;
            inputs["identifier"] = args ? args.identifier : undefined;
            inputs["name"] = args ? args.name : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CseCustomEntityType.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CseCustomEntityType resources.
 */
export interface CseCustomEntityTypeState {
    fields?: pulumi.Input<pulumi.Input<string>[]>;
    identifier?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CseCustomEntityType resource.
 */
export interface CseCustomEntityTypeArgs {
    fields: pulumi.Input<pulumi.Input<string>[]>;
    identifier: pulumi.Input<string>;
    name?: pulumi.Input<string>;
}