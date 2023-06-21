/**
 * Skip Pay API for partners
 * API documentation for Skip Pay partners.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: info@skippay.cz
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 */

package cz.skippay.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import cz.skippay.model.Address;
import cz.skippay.model.CustomerExtraData;
import cz.skippay.model.PrecheckResultResponseSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cz.skippay.JSON;

/**
 * Customer data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class CustomerResponse {
  public static final String SERIALIZED_NAME_TITLE_BEFORE = "titleBefore";
  @SerializedName(SERIALIZED_NAME_TITLE_BEFORE)
  private String titleBefore;

  public static final String SERIALIZED_NAME_TITLE_AFTER = "titleAfter";
  @SerializedName(SERIALIZED_NAME_TITLE_AFTER)
  private String titleAfter;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Address> addresses;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_VATIN = "vatin";
  @SerializedName(SERIALIZED_NAME_VATIN)
  private String vatin;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "extraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private CustomerExtraData extraData;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PRECHECK_RESULT_RESPONSE_SERIALIZER = "PrecheckResultResponseSerializer";
  @SerializedName(SERIALIZED_NAME_PRECHECK_RESULT_RESPONSE_SERIALIZER)
  private PrecheckResultResponseSerializer precheckResultResponseSerializer;

  public CustomerResponse() {
  }

  public CustomerResponse titleBefore(String titleBefore) {
    
    this.titleBefore = titleBefore;
    return this;
  }

   /**
   * Academical degree, in front of the name
   * @return titleBefore
  **/
  @javax.annotation.Nullable
  public String getTitleBefore() {
    return titleBefore;
  }


  public void setTitleBefore(String titleBefore) {
    this.titleBefore = titleBefore;
  }


  public CustomerResponse titleAfter(String titleAfter) {
    
    this.titleAfter = titleAfter;
    return this;
  }

   /**
   * Academical degree, behind name
   * @return titleAfter
  **/
  @javax.annotation.Nullable
  public String getTitleAfter() {
    return titleAfter;
  }


  public void setTitleAfter(String titleAfter) {
    this.titleAfter = titleAfter;
  }


  public CustomerResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * E-mail address of customer
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerResponse addresses(List<Address> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public CustomerResponse addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Addresses. All types are allowed.
   * @return addresses
  **/
  @javax.annotation.Nullable
  public List<Address> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  public CustomerResponse tin(String tin) {
    
    this.tin = tin;
    return this;
  }

   /**
   * Tax identification number (ICO)
   * @return tin
  **/
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }


  public void setTin(String tin) {
    this.tin = tin;
  }


  public CustomerResponse vatin(String vatin) {
    
    this.vatin = vatin;
    return this;
  }

   /**
   * VAT identification number
   * @return vatin
  **/
  @javax.annotation.Nullable
  public String getVatin() {
    return vatin;
  }


  public void setVatin(String vatin) {
    this.vatin = vatin;
  }


  public CustomerResponse extraData(CustomerExtraData extraData) {
    
    this.extraData = extraData;
    return this;
  }

   /**
   * Get extraData
   * @return extraData
  **/
  @javax.annotation.Nullable
  public CustomerExtraData getExtraData() {
    return extraData;
  }


  public void setExtraData(CustomerExtraData extraData) {
    this.extraData = extraData;
  }


  public CustomerResponse firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer first (given) name. Must be paired with &#x60;lastName&#x60;. Required if &#x60;fullName&#x60; is empty.
   * @return firstName
  **/
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CustomerResponse lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer last (family) name. Must be paired with &#x60;firstName&#x60;. Required if &#x60;fullName&#x60; is empty.
   * @return lastName
  **/
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CustomerResponse fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Customer full name, including academical degrees and salutation. Required only if &#x60;firstName&#x60; or &#x60;lastName&#x60; are empty.
   * @return fullName
  **/
  @javax.annotation.Nonnull
  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public CustomerResponse phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number with country code (including leading &#x60;+&#x60;).
   * @return phone
  **/
  @javax.annotation.Nonnull
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public CustomerResponse precheckResultResponseSerializer(PrecheckResultResponseSerializer precheckResultResponseSerializer) {
    
    this.precheckResultResponseSerializer = precheckResultResponseSerializer;
    return this;
  }

   /**
   * Get precheckResultResponseSerializer
   * @return precheckResultResponseSerializer
  **/
  @javax.annotation.Nullable
  public PrecheckResultResponseSerializer getPrecheckResultResponseSerializer() {
    return precheckResultResponseSerializer;
  }


  public void setPrecheckResultResponseSerializer(PrecheckResultResponseSerializer precheckResultResponseSerializer) {
    this.precheckResultResponseSerializer = precheckResultResponseSerializer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerResponse customerResponse = (CustomerResponse) o;
    return Objects.equals(this.titleBefore, customerResponse.titleBefore) &&
        Objects.equals(this.titleAfter, customerResponse.titleAfter) &&
        Objects.equals(this.email, customerResponse.email) &&
        Objects.equals(this.addresses, customerResponse.addresses) &&
        Objects.equals(this.tin, customerResponse.tin) &&
        Objects.equals(this.vatin, customerResponse.vatin) &&
        Objects.equals(this.extraData, customerResponse.extraData) &&
        Objects.equals(this.firstName, customerResponse.firstName) &&
        Objects.equals(this.lastName, customerResponse.lastName) &&
        Objects.equals(this.fullName, customerResponse.fullName) &&
        Objects.equals(this.phone, customerResponse.phone) &&
        Objects.equals(this.precheckResultResponseSerializer, customerResponse.precheckResultResponseSerializer);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(titleBefore, titleAfter, email, addresses, tin, vatin, extraData, firstName, lastName, fullName, phone, precheckResultResponseSerializer);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerResponse {\n");
    sb.append("    titleBefore: ").append(toIndentedString(titleBefore)).append("\n");
    sb.append("    titleAfter: ").append(toIndentedString(titleAfter)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    vatin: ").append(toIndentedString(vatin)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    precheckResultResponseSerializer: ").append(toIndentedString(precheckResultResponseSerializer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("titleBefore");
    openapiFields.add("titleAfter");
    openapiFields.add("email");
    openapiFields.add("addresses");
    openapiFields.add("tin");
    openapiFields.add("vatin");
    openapiFields.add("extraData");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("fullName");
    openapiFields.add("phone");
    openapiFields.add("PrecheckResultResponseSerializer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("fullName");
    openapiRequiredFields.add("phone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerResponse is not found in the empty JSON string", CustomerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("titleBefore") != null && !jsonObj.get("titleBefore").isJsonNull()) && !jsonObj.get("titleBefore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titleBefore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titleBefore").toString()));
      }
      if ((jsonObj.get("titleAfter") != null && !jsonObj.get("titleAfter").isJsonNull()) && !jsonObj.get("titleAfter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titleAfter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titleAfter").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            Address.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("vatin") != null && !jsonObj.get("vatin").isJsonNull()) && !jsonObj.get("vatin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vatin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vatin").toString()));
      }
      // validate the optional field `extraData`
      if (jsonObj.get("extraData") != null && !jsonObj.get("extraData").isJsonNull()) {
        CustomerExtraData.validateJsonObject(jsonObj.getAsJsonObject("extraData"));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerResponse>() {
           @Override
           public void write(JsonWriter out, CustomerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerResponse
  * @throws IOException if the JSON string is invalid with respect to CustomerResponse
  */
  public static CustomerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerResponse.class);
  }

 /**
  * Convert an instance of CustomerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

