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
import cz.skippay.model.DeliveryCarrierDefault;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import cz.skippay.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T12:24:35.068083+02:00[Europe/Prague]")
public class DeliveryCarrier extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DeliveryCarrier.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeliveryCarrier.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeliveryCarrier' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeliveryCarrierDefault> adapterDeliveryCarrierDefault = gson.getDelegateAdapter(this, TypeToken.get(DeliveryCarrierDefault.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            return (TypeAdapter<T>) new TypeAdapter<DeliveryCarrier>() {
                @Override
                public void write(JsonWriter out, DeliveryCarrier value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `DeliveryCarrierDefault`
                    if (value.getActualInstance() instanceof DeliveryCarrierDefault) {
                        JsonObject obj = adapterDeliveryCarrierDefault.toJsonTree((DeliveryCarrierDefault)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonObject obj = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: DeliveryCarrierDefault, String");
                }

                @Override
                public DeliveryCarrier read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize DeliveryCarrierDefault
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DeliveryCarrierDefault.validateJsonObject(jsonObject);
                        actualAdapter = adapterDeliveryCarrierDefault;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DeliveryCarrierDefault'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DeliveryCarrierDefault failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DeliveryCarrierDefault'", e);
                    }

                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        String.validateJsonObject(jsonObject);
                        actualAdapter = adapterString;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }

                    if (match == 1) {
                        DeliveryCarrier ret = new DeliveryCarrier();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for DeliveryCarrier: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DeliveryCarrier() {
        super("oneOf", Boolean.FALSE);
    }

    public DeliveryCarrier(DeliveryCarrierDefault o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DeliveryCarrier(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DeliveryCarrierDefault", new GenericType<DeliveryCarrierDefault>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DeliveryCarrier.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * DeliveryCarrierDefault, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof DeliveryCarrierDefault) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DeliveryCarrierDefault, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * DeliveryCarrierDefault, String
     *
     * @return The actual instance (DeliveryCarrierDefault, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeliveryCarrierDefault`. If the actual instance is not `DeliveryCarrierDefault`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeliveryCarrierDefault`
     * @throws ClassCastException if the instance is not `DeliveryCarrierDefault`
     */
    public DeliveryCarrierDefault getDeliveryCarrierDefault() throws ClassCastException {
        return (DeliveryCarrierDefault)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryCarrier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with DeliveryCarrierDefault
    try {
      DeliveryCarrierDefault.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DeliveryCarrierDefault failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with String
    try {
      String.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for DeliveryCarrier with oneOf schemas: DeliveryCarrierDefault, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of DeliveryCarrier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryCarrier
  * @throws IOException if the JSON string is invalid with respect to DeliveryCarrier
  */
  public static DeliveryCarrier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryCarrier.class);
  }

 /**
  * Convert an instance of DeliveryCarrier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

