#!/usr/bin/env cake

(require 'clojure.string)

(doall (println (str "{ completions = ( '" (clojure.string/join "','" (sort (set (complete/completions "" 'clojure.core)))) "' ); }")))



