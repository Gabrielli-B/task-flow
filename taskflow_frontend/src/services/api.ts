import axios from "axios";

export const api = axios.create({
    baseURL: "http://loca/lhost:8080",
});