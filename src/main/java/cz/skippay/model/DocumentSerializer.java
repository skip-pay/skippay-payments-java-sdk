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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of the document
 */
@JsonAdapter(DocumentSerializer.Adapter.class)
public enum DocumentSerializer {
  
  INVOICE("INVOICE"),
  
  PROFORMA_INVOICE("PROFORMA_INVOICE"),
  
  CREDIT_NOTE("CREDIT_NOTE"),
  
  OTHER("OTHER");

  private String value;

  DocumentSerializer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentSerializer fromValue(String value) {
    for (DocumentSerializer b : DocumentSerializer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DocumentSerializer> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentSerializer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentSerializer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DocumentSerializer.fromValue(value);
    }
  }
}

