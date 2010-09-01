#!/usr/bin/env cake

(println (sort (complete/completions "d" 'clojure.core)))