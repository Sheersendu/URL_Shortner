<template>
  <v-app>
    <div class="d-flex justify-center ma-4">
      <v-card
        width="450"
        elevation="5"
        title="Shorten a long URL"
        prepend-icon="mdi-link-variant"
        class="card"
      >
        <v-card-text>
          <v-text-field
            v-model="longUrl"
            label="Your long URL"
            variant="outlined"
          ></v-text-field>
        </v-card-text>
        <v-card-item
          prepend-icon="mdi-pencil-box-outline"
          title="Customise your link"
        ></v-card-item>
        <v-card-text>
          <v-row no-gutters>
            <v-col cols="6">
              <v-select
                v-model="model"
                :items="items"
                readonly
                label="Default Domain"
              ></v-select>
            </v-col>
            <v-col cols="1"></v-col>
            <v-col cols="5">
              <v-text-field
                v-model="aliases"
                label="Enter aliases"
                variant="outlined"
                :error-messages="validateAliases"
              ></v-text-field>
            </v-col>
          </v-row>
          <v-col class="text-center">
            <v-btn color="primary" @click="onShorten">Shorten</v-btn>
          </v-col>
        </v-card-text>
      </v-card>
    </div>
  </v-app>
</template>

<script lang="ts">
export default {
  name: "HomeView",
  data() {
    return {
      items: ["shortifyMe.com"],
      model: "shortifyMe.com",
      longUrl: "",
      aliases: "",
    };
  },
  computed: {
    validateAliases: function (this: { aliases: string }) {
      let aliasesLength = this.aliases.length;
      if (this.aliases != "" && (aliasesLength < 8 || aliasesLength > 16)) {
        return "Aliases should be between 8 and 16 characters";
      }
      return "";
    },
  },
  methods: {
    onShorten: function (this: { aliases: string; longUrl: string }) {
      console.log(this.aliases);
      console.log(this.longUrl);
    },
  },
};
</script>

<style>
.card {
  padding-bottom: 20px !important;
  margin-top: 10%;
}
</style>
