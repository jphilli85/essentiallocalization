package com.flat.localization.scheme;

import com.flat.localization.Node;

import java.util.List;

/**
 * Location algorithms attempt to update a target node's state by using the available information
 * about that node and other nodes.
 *
 * Created by Jacob Phillips (10/2014)
 */
public interface LocationAlgorithm {
    Node.State applyTo(Node target, List<Node> references);
    String getName();
}