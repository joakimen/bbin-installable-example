#!/usr/bin/env bb
(ns main
  (:require [clojure.string :as str]))

(defn reverse-string [s]
  (str/reverse s))

(let [s "balloon"]
  (println s "backwards is" (reverse-string s)))
