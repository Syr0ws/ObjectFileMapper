/*
 *    Copyright 2022 syr0ws
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.syr0ws.oym.common.adapter.provider.type.collection;

import com.github.syr0ws.oym.api.adapter.TypeAdapter;
import com.github.syr0ws.oym.common.adapter.type.collection.SetAdapter;

import java.util.Set;

public class SetAdapterProvider<E> extends AbstractCollectionAdapterProvider<E, Set<E>> {

    @Override
    protected TypeAdapter<Set<E>> getAdapter(TypeAdapter<E> adapter) {
        return new SetAdapter<>(adapter);
    }

    @Override
    public Class<? super Set<E>> getType() {
        return Set.class;
    }
}
