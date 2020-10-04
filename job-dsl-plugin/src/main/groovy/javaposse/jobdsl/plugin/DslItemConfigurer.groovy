package javaposse.jobdsl.plugin


import javaposse.jobdsl.dsl.Item

class DslItemConfigurer {
    /**
     * Merge a {@link Node} into an {@link Item}'s properties.
     *
     * @param node the XML node to merge
     * @param dslItem the DSL item to merge the properties into
     */
    static void mergeCredentials(Node node, Item dslItem) {
        dslItem.configure { p -> p / 'properties' << node }
    }
}
