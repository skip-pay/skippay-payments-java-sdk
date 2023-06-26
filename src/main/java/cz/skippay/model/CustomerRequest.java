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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class CustomerRequest {
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

  public CustomerRequest() {
  }

  public CustomerRequest titleBefore(String titleBefore) {
    
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


  public CustomerRequest titleAfter(String titleAfter) {
    
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


  public CustomerRequest email(String email) {
    
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


  public CustomerRequest addresses(List<Address> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public CustomerRequest addAddressesItem(Address addressesItem) {
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


  public CustomerRequest tin(String tin) {
    
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


  public CustomerRequest vatin(String vatin) {
    
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


  public CustomerRequest extraData(CustomerExtraData extraData) {
    
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


  public CustomerRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer first (given) name. Must be paired with &#x60;lastName&#x60;. Required if &#x60;fullName&#x60; is empty.
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CustomerRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer last (family) name. Must be paired with &#x60;firstName&#x60;. Required if &#x60;fullName&#x60; is empty.
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CustomerRequest fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Customer full name, including academical degrees and salutation. Required only if &#x60;firstName&#x60; or &#x60;lastName&#x60; are empty.
   * @return fullName
  **/
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public CustomerRequest phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number with country code (including leading &#x60;+&#x60;). Phone number is by default required if you are not able to send it contact us.
   * @return phone
  **/
  @javax.annotation.Nonnull
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRequest customerRequest = (CustomerRequest) o;
    return Objects.equals(this.titleBefore, customerRequest.titleBefore) &&
        Objects.equals(this.titleAfter, customerRequest.titleAfter) &&
        Objects.equals(this.email, customerRequest.email) &&
        Objects.equals(this.addresses, customerRequest.addresses) &&
        Objects.equals(this.tin, customerRequest.tin) &&
        Objects.equals(this.vatin, customerRequest.vatin) &&
        Objects.equals(this.extraData, customerRequest.extraData) &&
        Objects.equals(this.firstName, customerRequest.firstName) &&
        Objects.equals(this.lastName, customerRequest.lastName) &&
        Objects.equals(this.fullName, customerRequest.fullName) &&
        Objects.equals(this.phone, customerRequest.phone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(titleBefore, titleAfter, email, addresses, tin, vatin, extraData, firstName, lastName, fullName, phone);
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
    sb.append("class CustomerRequest {\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("phone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerRequest is not found in the empty JSON string", CustomerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("fullName") != null && !jsonObj.get("fullName").isJsonNull()) && !jsonObj.get("fullName").isJsonPrimitive()) {
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
       if (!CustomerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerRequest>() {
           @Override
           public void write(JsonWriter out, CustomerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerRequest
  * @throws IOException if the JSON string is invalid with respect to CustomerRequest
  */
  public static CustomerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerRequest.class);
  }

 /**
  * Convert an instance of CustomerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

