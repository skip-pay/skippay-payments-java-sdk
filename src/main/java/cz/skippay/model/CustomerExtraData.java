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
import cz.skippay.model.Amount;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * CustomerExtraData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:07:32.599404+02:00[Europe/Prague]")
public class CustomerExtraData {
  public static final String SERIALIZED_NAME_TRANSACTIONS_NUMBER = "transactionsNumber";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_NUMBER)
  private BigDecimal transactionsNumber;

  public static final String SERIALIZED_NAME_CASHLESS_TRANSACTIONS_NUMBER = "cashlessTransactionsNumber";
  @SerializedName(SERIALIZED_NAME_CASHLESS_TRANSACTIONS_NUMBER)
  private BigDecimal cashlessTransactionsNumber;

  public static final String SERIALIZED_NAME_TRANSACTIONS_SUM = "transactionsSum";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_SUM)
  private Amount transactionsSum;

  public static final String SERIALIZED_NAME_CASHLESS_TRANSACTIONS_SUM = "cashlessTransactionsSum";
  @SerializedName(SERIALIZED_NAME_CASHLESS_TRANSACTIONS_SUM)
  private Amount cashlessTransactionsSum;

  public static final String SERIALIZED_NAME_LATEST_TRANSACTION_DATE = "latestTransactionDate";
  @SerializedName(SERIALIZED_NAME_LATEST_TRANSACTION_DATE)
  private LocalDate latestTransactionDate;

  public static final String SERIALIZED_NAME_EARLIEST_TRANSACTION_DATE = "earliestTransactionDate";
  @SerializedName(SERIALIZED_NAME_EARLIEST_TRANSACTION_DATE)
  private LocalDate earliestTransactionDate;

  public static final String SERIALIZED_NAME_PAGE_TOTAL_TIME = "pageTotalTime";
  @SerializedName(SERIALIZED_NAME_PAGE_TOTAL_TIME)
  private BigDecimal pageTotalTime;

  public static final String SERIALIZED_NAME_PAGE_REVIEWS_TIME = "pageReviewsTime";
  @SerializedName(SERIALIZED_NAME_PAGE_REVIEWS_TIME)
  private BigDecimal pageReviewsTime;

  public static final String SERIALIZED_NAME_CART_ITEMS_REMOVED = "cartItemsRemoved";
  @SerializedName(SERIALIZED_NAME_CART_ITEMS_REMOVED)
  private BigDecimal cartItemsRemoved;

  public static final String SERIALIZED_NAME_ITEMS_VIEWED = "itemsViewed";
  @SerializedName(SERIALIZED_NAME_ITEMS_VIEWED)
  private BigDecimal itemsViewed;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public CustomerExtraData() {
  }

  public CustomerExtraData transactionsNumber(BigDecimal transactionsNumber) {
    
    this.transactionsNumber = transactionsNumber;
    return this;
  }

   /**
   * Historical count of customer&#39;s cash transactions made in partner&#39;s e-shop
   * minimum: 1
   * @return transactionsNumber
  **/
  @javax.annotation.Nullable
  public BigDecimal getTransactionsNumber() {
    return transactionsNumber;
  }


  public void setTransactionsNumber(BigDecimal transactionsNumber) {
    this.transactionsNumber = transactionsNumber;
  }


  public CustomerExtraData cashlessTransactionsNumber(BigDecimal cashlessTransactionsNumber) {
    
    this.cashlessTransactionsNumber = cashlessTransactionsNumber;
    return this;
  }

   /**
   * Historical count of customer&#39;s cashless transactions made in partner&#39;s e-shop
   * minimum: 1
   * @return cashlessTransactionsNumber
  **/
  @javax.annotation.Nullable
  public BigDecimal getCashlessTransactionsNumber() {
    return cashlessTransactionsNumber;
  }


  public void setCashlessTransactionsNumber(BigDecimal cashlessTransactionsNumber) {
    this.cashlessTransactionsNumber = cashlessTransactionsNumber;
  }


  public CustomerExtraData transactionsSum(Amount transactionsSum) {
    
    this.transactionsSum = transactionsSum;
    return this;
  }

   /**
   * Get transactionsSum
   * @return transactionsSum
  **/
  @javax.annotation.Nullable
  public Amount getTransactionsSum() {
    return transactionsSum;
  }


  public void setTransactionsSum(Amount transactionsSum) {
    this.transactionsSum = transactionsSum;
  }


  public CustomerExtraData cashlessTransactionsSum(Amount cashlessTransactionsSum) {
    
    this.cashlessTransactionsSum = cashlessTransactionsSum;
    return this;
  }

   /**
   * Get cashlessTransactionsSum
   * @return cashlessTransactionsSum
  **/
  @javax.annotation.Nullable
  public Amount getCashlessTransactionsSum() {
    return cashlessTransactionsSum;
  }


  public void setCashlessTransactionsSum(Amount cashlessTransactionsSum) {
    this.cashlessTransactionsSum = cashlessTransactionsSum;
  }


  public CustomerExtraData latestTransactionDate(LocalDate latestTransactionDate) {
    
    this.latestTransactionDate = latestTransactionDate;
    return this;
  }

   /**
   * Newest transaction date on partner e-shop.
   * @return latestTransactionDate
  **/
  @javax.annotation.Nullable
  public LocalDate getLatestTransactionDate() {
    return latestTransactionDate;
  }


  public void setLatestTransactionDate(LocalDate latestTransactionDate) {
    this.latestTransactionDate = latestTransactionDate;
  }


  public CustomerExtraData earliestTransactionDate(LocalDate earliestTransactionDate) {
    
    this.earliestTransactionDate = earliestTransactionDate;
    return this;
  }

   /**
   * Oldest transaction date on partner e-shop
   * @return earliestTransactionDate
  **/
  @javax.annotation.Nullable
  public LocalDate getEarliestTransactionDate() {
    return earliestTransactionDate;
  }


  public void setEarliestTransactionDate(LocalDate earliestTransactionDate) {
    this.earliestTransactionDate = earliestTransactionDate;
  }


  public CustomerExtraData pageTotalTime(BigDecimal pageTotalTime) {
    
    this.pageTotalTime = pageTotalTime;
    return this;
  }

   /**
   * Total time spent on partners website (in seconds)
   * minimum: 1
   * @return pageTotalTime
  **/
  @javax.annotation.Nullable
  public BigDecimal getPageTotalTime() {
    return pageTotalTime;
  }


  public void setPageTotalTime(BigDecimal pageTotalTime) {
    this.pageTotalTime = pageTotalTime;
  }


  public CustomerExtraData pageReviewsTime(BigDecimal pageReviewsTime) {
    
    this.pageReviewsTime = pageReviewsTime;
    return this;
  }

   /**
   * Total time spent on partners website in review and comments sections (in seconds)
   * minimum: 1
   * @return pageReviewsTime
  **/
  @javax.annotation.Nullable
  public BigDecimal getPageReviewsTime() {
    return pageReviewsTime;
  }


  public void setPageReviewsTime(BigDecimal pageReviewsTime) {
    this.pageReviewsTime = pageReviewsTime;
  }


  public CustomerExtraData cartItemsRemoved(BigDecimal cartItemsRemoved) {
    
    this.cartItemsRemoved = cartItemsRemoved;
    return this;
  }

   /**
   * Total count of removed items form shopping basket during current shopping
   * minimum: 1
   * @return cartItemsRemoved
  **/
  @javax.annotation.Nullable
  public BigDecimal getCartItemsRemoved() {
    return cartItemsRemoved;
  }


  public void setCartItemsRemoved(BigDecimal cartItemsRemoved) {
    this.cartItemsRemoved = cartItemsRemoved;
  }


  public CustomerExtraData itemsViewed(BigDecimal itemsViewed) {
    
    this.itemsViewed = itemsViewed;
    return this;
  }

   /**
   * Number of viewed pages with products
   * minimum: 1
   * @return itemsViewed
  **/
  @javax.annotation.Nullable
  public BigDecimal getItemsViewed() {
    return itemsViewed;
  }


  public void setItemsViewed(BigDecimal itemsViewed) {
    this.itemsViewed = itemsViewed;
  }


  public CustomerExtraData tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CustomerExtraData addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of custom tags (ie. information, that customer is club member, vip customer, etc.)
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerExtraData customerExtraData = (CustomerExtraData) o;
    return Objects.equals(this.transactionsNumber, customerExtraData.transactionsNumber) &&
        Objects.equals(this.cashlessTransactionsNumber, customerExtraData.cashlessTransactionsNumber) &&
        Objects.equals(this.transactionsSum, customerExtraData.transactionsSum) &&
        Objects.equals(this.cashlessTransactionsSum, customerExtraData.cashlessTransactionsSum) &&
        Objects.equals(this.latestTransactionDate, customerExtraData.latestTransactionDate) &&
        Objects.equals(this.earliestTransactionDate, customerExtraData.earliestTransactionDate) &&
        Objects.equals(this.pageTotalTime, customerExtraData.pageTotalTime) &&
        Objects.equals(this.pageReviewsTime, customerExtraData.pageReviewsTime) &&
        Objects.equals(this.cartItemsRemoved, customerExtraData.cartItemsRemoved) &&
        Objects.equals(this.itemsViewed, customerExtraData.itemsViewed) &&
        Objects.equals(this.tags, customerExtraData.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionsNumber, cashlessTransactionsNumber, transactionsSum, cashlessTransactionsSum, latestTransactionDate, earliestTransactionDate, pageTotalTime, pageReviewsTime, cartItemsRemoved, itemsViewed, tags);
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
    sb.append("class CustomerExtraData {\n");
    sb.append("    transactionsNumber: ").append(toIndentedString(transactionsNumber)).append("\n");
    sb.append("    cashlessTransactionsNumber: ").append(toIndentedString(cashlessTransactionsNumber)).append("\n");
    sb.append("    transactionsSum: ").append(toIndentedString(transactionsSum)).append("\n");
    sb.append("    cashlessTransactionsSum: ").append(toIndentedString(cashlessTransactionsSum)).append("\n");
    sb.append("    latestTransactionDate: ").append(toIndentedString(latestTransactionDate)).append("\n");
    sb.append("    earliestTransactionDate: ").append(toIndentedString(earliestTransactionDate)).append("\n");
    sb.append("    pageTotalTime: ").append(toIndentedString(pageTotalTime)).append("\n");
    sb.append("    pageReviewsTime: ").append(toIndentedString(pageReviewsTime)).append("\n");
    sb.append("    cartItemsRemoved: ").append(toIndentedString(cartItemsRemoved)).append("\n");
    sb.append("    itemsViewed: ").append(toIndentedString(itemsViewed)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("transactionsNumber");
    openapiFields.add("cashlessTransactionsNumber");
    openapiFields.add("transactionsSum");
    openapiFields.add("cashlessTransactionsSum");
    openapiFields.add("latestTransactionDate");
    openapiFields.add("earliestTransactionDate");
    openapiFields.add("pageTotalTime");
    openapiFields.add("pageReviewsTime");
    openapiFields.add("cartItemsRemoved");
    openapiFields.add("itemsViewed");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerExtraData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerExtraData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerExtraData is not found in the empty JSON string", CustomerExtraData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerExtraData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerExtraData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `transactionsSum`
      if (jsonObj.get("transactionsSum") != null && !jsonObj.get("transactionsSum").isJsonNull()) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("transactionsSum"));
      }
      // validate the optional field `cashlessTransactionsSum`
      if (jsonObj.get("cashlessTransactionsSum") != null && !jsonObj.get("cashlessTransactionsSum").isJsonNull()) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("cashlessTransactionsSum"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerExtraData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerExtraData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerExtraData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerExtraData.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerExtraData>() {
           @Override
           public void write(JsonWriter out, CustomerExtraData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerExtraData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerExtraData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerExtraData
  * @throws IOException if the JSON string is invalid with respect to CustomerExtraData
  */
  public static CustomerExtraData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerExtraData.class);
  }

 /**
  * Convert an instance of CustomerExtraData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

