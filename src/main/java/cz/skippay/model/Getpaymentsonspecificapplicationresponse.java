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
import cz.skippay.model.PagingInfo;
import cz.skippay.model.Payment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Getpaymentsonspecificapplicationresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class Getpaymentsonspecificapplicationresponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Payment> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGING_INFO = "pagingInfo";
  @SerializedName(SERIALIZED_NAME_PAGING_INFO)
  private PagingInfo pagingInfo;

  public Getpaymentsonspecificapplicationresponse() {
  }

  public Getpaymentsonspecificapplicationresponse data(List<Payment> data) {
    
    this.data = data;
    return this;
  }

  public Getpaymentsonspecificapplicationresponse addDataItem(Payment dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<Payment> getData() {
    return data;
  }


  public void setData(List<Payment> data) {
    this.data = data;
  }


  public Getpaymentsonspecificapplicationresponse pagingInfo(PagingInfo pagingInfo) {
    
    this.pagingInfo = pagingInfo;
    return this;
  }

   /**
   * Get pagingInfo
   * @return pagingInfo
  **/
  @javax.annotation.Nullable
  public PagingInfo getPagingInfo() {
    return pagingInfo;
  }


  public void setPagingInfo(PagingInfo pagingInfo) {
    this.pagingInfo = pagingInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Getpaymentsonspecificapplicationresponse getpaymentsonspecificapplicationresponse = (Getpaymentsonspecificapplicationresponse) o;
    return Objects.equals(this.data, getpaymentsonspecificapplicationresponse.data) &&
        Objects.equals(this.pagingInfo, getpaymentsonspecificapplicationresponse.pagingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, pagingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Getpaymentsonspecificapplicationresponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    pagingInfo: ").append(toIndentedString(pagingInfo)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("pagingInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Getpaymentsonspecificapplicationresponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Getpaymentsonspecificapplicationresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Getpaymentsonspecificapplicationresponse is not found in the empty JSON string", Getpaymentsonspecificapplicationresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Getpaymentsonspecificapplicationresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Getpaymentsonspecificapplicationresponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Getpaymentsonspecificapplicationresponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        Payment.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
      };
      // validate the optional field `pagingInfo`
      if (jsonObj.get("pagingInfo") != null && !jsonObj.get("pagingInfo").isJsonNull()) {
        PagingInfo.validateJsonObject(jsonObj.getAsJsonObject("pagingInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Getpaymentsonspecificapplicationresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Getpaymentsonspecificapplicationresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Getpaymentsonspecificapplicationresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Getpaymentsonspecificapplicationresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Getpaymentsonspecificapplicationresponse>() {
           @Override
           public void write(JsonWriter out, Getpaymentsonspecificapplicationresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Getpaymentsonspecificapplicationresponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Getpaymentsonspecificapplicationresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Getpaymentsonspecificapplicationresponse
  * @throws IOException if the JSON string is invalid with respect to Getpaymentsonspecificapplicationresponse
  */
  public static Getpaymentsonspecificapplicationresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Getpaymentsonspecificapplicationresponse.class);
  }

 /**
  * Convert an instance of Getpaymentsonspecificapplicationresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

