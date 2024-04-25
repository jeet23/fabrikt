package examples.webhook.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import javax.validation.constraints.NotNull
import kotlin.Long
import kotlin.String

public data class Pet(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: Long,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("tag")
  @get:JsonProperty("tag")
  public val tag: String? = null,
)
