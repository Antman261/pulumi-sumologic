// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sumologic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a [Sumologic Ingest Budget](https://help.sumologic.com/Manage/Ingestion-and-Volume/Ingest_Budgets). To assign an Ingest Budget to the Collector use the field `_budget` with the Field Value of the Ingest Budget to assign.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-sumologic/sdk/go/sumologic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			budget, err := sumologic.NewIngestBudget(ctx, "budget", &sumologic.IngestBudgetArgs{
//				CapacityBytes: pulumi.Int(30000000000),
//				Description:   pulumi.String("For testing purposes"),
//				FieldValue:    pulumi.String("test"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sumologic.NewCollector(ctx, "collector", &sumologic.CollectorArgs{
//				Fields: pulumi.StringMap{
//					"_budget": budget.FieldValue,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Ingest budgets can be imported using the name, e.g.hcl
//
// ```sh
//
//	$ pulumi import sumologic:index/ingestBudget:IngestBudget budget budgetName
//
// ```
//
//	[1]https://help.sumologic.com/Manage/Ingestion-and-Volume/Ingest_Budgets [2]https://en.wikipedia.org/wiki/Tz_database
type IngestBudget struct {
	pulumi.CustomResourceState

	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action pulumi.StringPtrOutput `pulumi:"action"`
	// Capacity of the ingest budget, in bytes.
	CapacityBytes pulumi.IntOutput `pulumi:"capacityBytes"`
	// Description of the ingest budget.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Custom field value that is used to assign Collectors to the ingest budget.
	FieldValue pulumi.StringOutput `pulumi:"fieldValue"`
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name pulumi.StringOutput `pulumi:"name"`
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime pulumi.StringPtrOutput `pulumi:"resetTime"`
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone pulumi.StringPtrOutput `pulumi:"timezone"`
}

// NewIngestBudget registers a new resource with the given unique name, arguments, and options.
func NewIngestBudget(ctx *pulumi.Context,
	name string, args *IngestBudgetArgs, opts ...pulumi.ResourceOption) (*IngestBudget, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CapacityBytes == nil {
		return nil, errors.New("invalid value for required argument 'CapacityBytes'")
	}
	if args.FieldValue == nil {
		return nil, errors.New("invalid value for required argument 'FieldValue'")
	}
	var resource IngestBudget
	err := ctx.RegisterResource("sumologic:index/ingestBudget:IngestBudget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIngestBudget gets an existing IngestBudget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIngestBudget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IngestBudgetState, opts ...pulumi.ResourceOption) (*IngestBudget, error) {
	var resource IngestBudget
	err := ctx.ReadResource("sumologic:index/ingestBudget:IngestBudget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IngestBudget resources.
type ingestBudgetState struct {
	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action *string `pulumi:"action"`
	// Capacity of the ingest budget, in bytes.
	CapacityBytes *int `pulumi:"capacityBytes"`
	// Description of the ingest budget.
	Description *string `pulumi:"description"`
	// Custom field value that is used to assign Collectors to the ingest budget.
	FieldValue *string `pulumi:"fieldValue"`
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name *string `pulumi:"name"`
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime *string `pulumi:"resetTime"`
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone *string `pulumi:"timezone"`
}

type IngestBudgetState struct {
	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action pulumi.StringPtrInput
	// Capacity of the ingest budget, in bytes.
	CapacityBytes pulumi.IntPtrInput
	// Description of the ingest budget.
	Description pulumi.StringPtrInput
	// Custom field value that is used to assign Collectors to the ingest budget.
	FieldValue pulumi.StringPtrInput
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name pulumi.StringPtrInput
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime pulumi.StringPtrInput
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone pulumi.StringPtrInput
}

func (IngestBudgetState) ElementType() reflect.Type {
	return reflect.TypeOf((*ingestBudgetState)(nil)).Elem()
}

type ingestBudgetArgs struct {
	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action *string `pulumi:"action"`
	// Capacity of the ingest budget, in bytes.
	CapacityBytes int `pulumi:"capacityBytes"`
	// Description of the ingest budget.
	Description *string `pulumi:"description"`
	// Custom field value that is used to assign Collectors to the ingest budget.
	FieldValue string `pulumi:"fieldValue"`
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name *string `pulumi:"name"`
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime *string `pulumi:"resetTime"`
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone *string `pulumi:"timezone"`
}

// The set of arguments for constructing a IngestBudget resource.
type IngestBudgetArgs struct {
	// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
	Action pulumi.StringPtrInput
	// Capacity of the ingest budget, in bytes.
	CapacityBytes pulumi.IntInput
	// Description of the ingest budget.
	Description pulumi.StringPtrInput
	// Custom field value that is used to assign Collectors to the ingest budget.
	FieldValue pulumi.StringInput
	// Display name of the ingest budget. This must be unique across all of the ingest budgets
	Name pulumi.StringPtrInput
	// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
	ResetTime pulumi.StringPtrInput
	// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
	Timezone pulumi.StringPtrInput
}

func (IngestBudgetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ingestBudgetArgs)(nil)).Elem()
}

type IngestBudgetInput interface {
	pulumi.Input

	ToIngestBudgetOutput() IngestBudgetOutput
	ToIngestBudgetOutputWithContext(ctx context.Context) IngestBudgetOutput
}

func (*IngestBudget) ElementType() reflect.Type {
	return reflect.TypeOf((**IngestBudget)(nil)).Elem()
}

func (i *IngestBudget) ToIngestBudgetOutput() IngestBudgetOutput {
	return i.ToIngestBudgetOutputWithContext(context.Background())
}

func (i *IngestBudget) ToIngestBudgetOutputWithContext(ctx context.Context) IngestBudgetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngestBudgetOutput)
}

// IngestBudgetArrayInput is an input type that accepts IngestBudgetArray and IngestBudgetArrayOutput values.
// You can construct a concrete instance of `IngestBudgetArrayInput` via:
//
//	IngestBudgetArray{ IngestBudgetArgs{...} }
type IngestBudgetArrayInput interface {
	pulumi.Input

	ToIngestBudgetArrayOutput() IngestBudgetArrayOutput
	ToIngestBudgetArrayOutputWithContext(context.Context) IngestBudgetArrayOutput
}

type IngestBudgetArray []IngestBudgetInput

func (IngestBudgetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IngestBudget)(nil)).Elem()
}

func (i IngestBudgetArray) ToIngestBudgetArrayOutput() IngestBudgetArrayOutput {
	return i.ToIngestBudgetArrayOutputWithContext(context.Background())
}

func (i IngestBudgetArray) ToIngestBudgetArrayOutputWithContext(ctx context.Context) IngestBudgetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngestBudgetArrayOutput)
}

// IngestBudgetMapInput is an input type that accepts IngestBudgetMap and IngestBudgetMapOutput values.
// You can construct a concrete instance of `IngestBudgetMapInput` via:
//
//	IngestBudgetMap{ "key": IngestBudgetArgs{...} }
type IngestBudgetMapInput interface {
	pulumi.Input

	ToIngestBudgetMapOutput() IngestBudgetMapOutput
	ToIngestBudgetMapOutputWithContext(context.Context) IngestBudgetMapOutput
}

type IngestBudgetMap map[string]IngestBudgetInput

func (IngestBudgetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IngestBudget)(nil)).Elem()
}

func (i IngestBudgetMap) ToIngestBudgetMapOutput() IngestBudgetMapOutput {
	return i.ToIngestBudgetMapOutputWithContext(context.Background())
}

func (i IngestBudgetMap) ToIngestBudgetMapOutputWithContext(ctx context.Context) IngestBudgetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngestBudgetMapOutput)
}

type IngestBudgetOutput struct{ *pulumi.OutputState }

func (IngestBudgetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IngestBudget)(nil)).Elem()
}

func (o IngestBudgetOutput) ToIngestBudgetOutput() IngestBudgetOutput {
	return o
}

func (o IngestBudgetOutput) ToIngestBudgetOutputWithContext(ctx context.Context) IngestBudgetOutput {
	return o
}

// Action to take when ingest budget's capacity is reached. All actions are audited. Supported values are `stopCollecting` and `keepCollecting`.
func (o IngestBudgetOutput) Action() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IngestBudget) pulumi.StringPtrOutput { return v.Action }).(pulumi.StringPtrOutput)
}

// Capacity of the ingest budget, in bytes.
func (o IngestBudgetOutput) CapacityBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *IngestBudget) pulumi.IntOutput { return v.CapacityBytes }).(pulumi.IntOutput)
}

// Description of the ingest budget.
func (o IngestBudgetOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IngestBudget) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Custom field value that is used to assign Collectors to the ingest budget.
func (o IngestBudgetOutput) FieldValue() pulumi.StringOutput {
	return o.ApplyT(func(v *IngestBudget) pulumi.StringOutput { return v.FieldValue }).(pulumi.StringOutput)
}

// Display name of the ingest budget. This must be unique across all of the ingest budgets
func (o IngestBudgetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IngestBudget) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Reset time of the ingest budget in HH:MM format. Defaults to `00:00`
func (o IngestBudgetOutput) ResetTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IngestBudget) pulumi.StringPtrOutput { return v.ResetTime }).(pulumi.StringPtrOutput)
}

// The time zone to use for this collector. The value follows the [tzdata](https://en.wikipedia.org/wiki/Tz_database) naming convention. Defaults to `Etc/UTC`
func (o IngestBudgetOutput) Timezone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IngestBudget) pulumi.StringPtrOutput { return v.Timezone }).(pulumi.StringPtrOutput)
}

type IngestBudgetArrayOutput struct{ *pulumi.OutputState }

func (IngestBudgetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IngestBudget)(nil)).Elem()
}

func (o IngestBudgetArrayOutput) ToIngestBudgetArrayOutput() IngestBudgetArrayOutput {
	return o
}

func (o IngestBudgetArrayOutput) ToIngestBudgetArrayOutputWithContext(ctx context.Context) IngestBudgetArrayOutput {
	return o
}

func (o IngestBudgetArrayOutput) Index(i pulumi.IntInput) IngestBudgetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IngestBudget {
		return vs[0].([]*IngestBudget)[vs[1].(int)]
	}).(IngestBudgetOutput)
}

type IngestBudgetMapOutput struct{ *pulumi.OutputState }

func (IngestBudgetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IngestBudget)(nil)).Elem()
}

func (o IngestBudgetMapOutput) ToIngestBudgetMapOutput() IngestBudgetMapOutput {
	return o
}

func (o IngestBudgetMapOutput) ToIngestBudgetMapOutputWithContext(ctx context.Context) IngestBudgetMapOutput {
	return o
}

func (o IngestBudgetMapOutput) MapIndex(k pulumi.StringInput) IngestBudgetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IngestBudget {
		return vs[0].(map[string]*IngestBudget)[vs[1].(string)]
	}).(IngestBudgetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IngestBudgetInput)(nil)).Elem(), &IngestBudget{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngestBudgetArrayInput)(nil)).Elem(), IngestBudgetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngestBudgetMapInput)(nil)).Elem(), IngestBudgetMap{})
	pulumi.RegisterOutputType(IngestBudgetOutput{})
	pulumi.RegisterOutputType(IngestBudgetArrayOutput{})
	pulumi.RegisterOutputType(IngestBudgetMapOutput{})
}
