//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 08:46:22 AM CST 
//


package org.sireum.bakar.gnatxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Definition_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Definition_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="not_an_element" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="derived_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="derived_record_extension_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="enumeration_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="signed_integer_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="modular_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="root_integer_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="root_real_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="universal_integer_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="universal_real_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="universal_fixed_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="floating_point_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ordinary_fixed_point_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="decimal_fixed_point_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="unconstrained_array_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="constrained_array_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="record_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="tagged_record_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ordinary_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="limited_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="task_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="protected_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="synchronized_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="pool_specific_access_to_variable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="access_to_variable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="access_to_constant" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="access_to_procedure" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="access_to_protected_procedure" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="access_to_function" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="access_to_protected_function" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="subtype_indication" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="range_attribute_reference" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="simple_expression_range" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="digits_constraint" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="delta_constraint" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="index_constraint" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="discriminant_constraint" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="component_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="discrete_subtype_indication_as_subtype_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="discrete_range_attribute_reference_as_subtype_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="discrete_simple_expression_range_as_subtype_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="discrete_subtype_indication" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="discrete_range_attribute_reference" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="discrete_simple_expression_range" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="unknown_discriminant_part" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="known_discriminant_part" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="record_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="null_record_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="null_component" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="variant_part" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="variant" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="others_choice" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="anonymous_access_to_variable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="anonymous_access_to_constant" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="anonymous_access_to_procedure" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="anonymous_access_to_protected_procedure" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="anonymous_access_to_function" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="anonymous_access_to_protected_function" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="private_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="tagged_private_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="private_extension_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="task_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="protected_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_private_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_tagged_private_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_derived_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_discrete_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_signed_integer_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_modular_type_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_floating_point_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_ordinary_fixed_point_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_decimal_fixed_point_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_ordinary_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_limited_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_task_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_protected_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_synchronized_interface" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_unconstrained_array_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_constrained_array_definition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_pool_specific_access_to_variable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_access_to_variable" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_access_to_constant" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_access_to_procedure" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_access_to_protected_procedure" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_access_to_function" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="formal_access_to_protected_function" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="aspect_specification" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="selected_component" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="base_attribute" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="class_attribute" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;group ref="{}pragmas_group"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Definition_List", propOrder = {
    "notAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition"
})
public class DefinitionList {

    @XmlElementRefs({
        @XmlElementRef(name = "page_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "index_constraint", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_derived_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "access_to_function", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discard_names_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "all_calls_remote_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "delta_constraint", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interrupt_handler_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_limited_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "queuing_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "universal_real_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anonymous_access_to_function", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "locking_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variant_part", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_private_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_unconstrained_array_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_access_to_variable", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "range_attribute_reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discrete_range_attribute_reference_as_subtype_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_signed_integer_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_protected_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_ordinary_fixed_point_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unknown_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "default_storage_pool_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cpu_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unsuppress_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "signed_integer_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_discrete_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_access_to_protected_procedure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discrete_simple_expression_range_as_subtype_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "access_to_procedure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dispatching_domain_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "no_return_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elaborate_all_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "task_dispatching_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anonymous_access_to_protected_procedure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "null_component", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "floating_point_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aspect_specification", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "limited_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_ordinary_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_constrained_array_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unknown_discriminant_part", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "access_to_variable", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subtype_indication", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "private_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shared_passive_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "optimize_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pool_specific_access_to_variable", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inspection_point_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "asynchronous_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interrupt_priority_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_access_to_protected_function", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "access_to_protected_function", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pure_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "access_to_constant", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "derived_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "priority_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "implementation_defined_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_tagged_private_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_synchronized_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anonymous_access_to_protected_function", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tagged_private_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "universal_integer_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "digits_constraint", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "access_to_protected_procedure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "others_choice", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "detect_blocking_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pack_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remote_call_interface_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volatile_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "suppress_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "decimal_fixed_point_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anonymous_access_to_constant", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "modular_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_decimal_fixed_point_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "independent_components_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "protected_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "normalize_scalars_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "record_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discriminant_constraint", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enumeration_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "storage_size_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "not_an_element", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_floating_point_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "export_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "priority_specific_dispatching_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "base_attribute", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "profile_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "task_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "relative_deadline_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discrete_simple_expression_range", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "universal_fixed_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "preelaborate_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elaborate_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_access_to_constant", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_pool_specific_access_to_variable", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reviewable_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "protected_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "restrictions_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "record_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "null_record_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variant", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "convention_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tagged_record_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "controlled_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "known_discriminant_part", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unchecked_union_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "import_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_task_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "private_extension_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "class_attribute", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "preelaborable_initialization_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volatile_components_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discrete_subtype_indication_as_subtype_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "simple_expression_range", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "derived_record_extension_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "atomic_components_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anonymous_access_to_procedure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "partition_elaboration_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unconstrained_array_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "task_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discrete_subtype_indication", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discrete_range_attribute_reference", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ordinary_fixed_point_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "identifier", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_modular_type_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "independent_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "root_integer_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_access_to_procedure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "assert_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ordinary_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elaborate_body_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anonymous_access_to_variable", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "root_real_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "synchronized_interface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "linker_options_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inline_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formal_access_to_function", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "constrained_array_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "selected_component", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "attach_handler_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "component_definition", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "assertion_policy_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "atomic_pragma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remote_types_pragma", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Object>> notAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition;

    /**
     * Gets the value of the notAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getNotAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition() {
        if (notAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition == null) {
            notAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition = new ArrayList<JAXBElement<Object>>();
        }
        return this.notAnElementOrDerivedTypeDefinitionOrDerivedRecordExtensionDefinition;
    }

}