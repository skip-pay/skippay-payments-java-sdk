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
import java.io.IOException;
import java.math.BigDecimal;

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
 * PagingInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class PagingInfo {
  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "itemsPerPage";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  private BigDecimal itemsPerPage;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREV_PAGE = "prevPage";
  @SerializedName(SERIALIZED_NAME_PREV_PAGE)
  private String prevPage;

  public PagingInfo() {
  }

  public PagingInfo itemsPerPage(BigDecimal itemsPerPage) {
    
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * Number of items per page
   * @return itemsPerPage
  **/
  @javax.annotation.Nonnull
  public BigDecimal getItemsPerPage() {
    return itemsPerPage;
  }


  public void setItemsPerPage(BigDecimal itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }


  public PagingInfo nextPage(String nextPage) {
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Request to retrieve next page, if it exists and can be unambiguously specified
   * @return nextPage
  **/
  @javax.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }


  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public PagingInfo prevPage(String prevPage) {
    
    this.prevPage = prevPage;
    return this;
  }

   /**
   * Request to retrieve previous page, if it exists and can be unambiguously specified
   * @return prevPage
  **/
  @javax.annotation.Nullable
  public String getPrevPage() {
    return prevPage;
  }


  public void setPrevPage(String prevPage) {
    this.prevPage = prevPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagingInfo pagingInfo = (PagingInfo) o;
    return Objects.equals(this.itemsPerPage, pagingInfo.itemsPerPage) &&
        Objects.equals(this.nextPage, pagingInfo.nextPage) &&
        Objects.equals(this.prevPage, pagingInfo.prevPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemsPerPage, nextPage, prevPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingInfo {\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    prevPage: ").append(toIndentedString(prevPage)).append("\n");
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
    openapiFields.add("itemsPerPage");
    openapiFields.add("nextPage");
    openapiFields.add("prevPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("itemsPerPage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PagingInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PagingInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagingInfo is not found in the empty JSON string", PagingInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PagingInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PagingInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PagingInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if ((jsonObj.get("prevPage") != null && !jsonObj.get("prevPage").isJsonNull()) && !jsonObj.get("prevPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prevPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prevPage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PagingInfo>() {
           @Override
           public void write(JsonWriter out, PagingInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagingInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PagingInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagingInfo
  * @throws IOException if the JSON string is invalid with respect to PagingInfo
  */
  public static PagingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagingInfo.class);
  }

 /**
  * Convert an instance of PagingInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

