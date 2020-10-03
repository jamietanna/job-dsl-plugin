package javaposse.jobdsl.plugin


import javaposse.jobdsl.dsl.Item

class DslItemConfigurer {
    static void merge(Node node, Item dslItem) {
        dslItem.configure { p -> p / 'properties' << node }
    }
}
