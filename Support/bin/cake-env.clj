#!/usr/bin/env cake
(ns textmate)

(println "cake/*vars* </p>")
(println (clojure.pprint/pprint (sort cake/*vars*)))
