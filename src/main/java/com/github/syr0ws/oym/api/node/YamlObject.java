package com.github.syr0ws.oym.api.node;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class YamlObject extends AbstractNode implements YamlNode {

    private final Map<String, YamlNode> nodes;

    public YamlObject() {
        this.nodes = new LinkedHashMap<>();
    }

    public YamlObject(Map<String, YamlNode> nodes) {
        this();
        this.nodes.putAll(nodes);
    }

    @Override
    public boolean isObject() {
        return true;
    }

    @Override
    public boolean isCollection() {
        return false;
    }

    @Override
    public Object get() {
        return this.getProperties();
    }

    public void addProperty(@NotNull String key, @NotNull YamlNode node) {
        this.nodes.put(key, node);
    }

    public boolean removeProperty(@NotNull String key) {
        return this.nodes.remove(key) != null;
    }

    public boolean hasProperty(@NotNull String key) {
        return this.nodes.containsKey(key);
    }

    public YamlNode getProperty(@NotNull String key) {
        return this.nodes.get(key);
    }

    public Map<String, YamlNode> getProperties() {
        return Collections.unmodifiableMap(this.nodes);
    }
}
