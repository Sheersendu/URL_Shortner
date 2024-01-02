<template>
    <v-app>
    <div class="d-flex justify-center ma-4">
      <v-card
        width="450"
        elevation="5"
        title="Sign Up!"
        prepend-icon="mdi-account"
        class="card"
      >
      <v-card-text>
          <v-text-field
            v-model="longUrl"
            label="Your email"
            variant="outlined"
          ></v-text-field>
          <v-text-field
            v-model="longUrl"
            label="Your password"
            variant="outlined"
          ></v-text-field>
        </v-card-text>
        <v-card-item
          prepend-icon="mdi-pencil-box-outline"
          title="Login!"
        ></v-card-item>
        <v-card-text>
          <v-text-field
            v-model="longUrl"
            label="Your username"
            variant="outlined"
          ></v-text-field>
          <v-text-field
            v-model="longUrl"
            label="Your password"
            variant="outlined"
          ></v-text-field>
          <v-row no-gutters>
            <v-col class="text-center">
            <v-btn color="primary">Submit</v-btn>
          </v-col>
        </v-row>
        </v-card-text>
      </v-card>
    </div>
  </v-app>
</template>

<script lang="ts">
export default {
  name: "LoginView",
  data() {
    return {
        items: ["shortifyMe.com"],
      model: "shortifyMe.com",
      longUrl: "",
      aliases: "",
    };
  }
}
</script>