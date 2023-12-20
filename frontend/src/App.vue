<template>
  <v-app>
    <NavBar />
    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>

<script lang="ts">
import NavBar from "./components/NavBar.vue";

export default {
  name: "App",
  components: {
    NavBar,
  },
  data() {
    return {};
  },
};
</script>
<style>
.bg {
  background: url("https://ohlaladani.com.br/wp-content/uploads/wallpaper-OHLALADANI_DESKTOP_WALLPAPERS_AVENTURA-2.jpg")
    no-repeat center center fixed !important;
  background-size: cover;
  min-height: 100vh;
}
</style>
