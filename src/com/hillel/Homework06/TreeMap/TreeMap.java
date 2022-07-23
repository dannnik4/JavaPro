package com.hillel.Homework06.TreeMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class TreeMap<K, V> implements Map<K, V> {
    private Entry<K, V> root;
    private int mapSize;
    private Set<K> keySet = null;

    public TreeMap() {
        root = null;
        mapSize = 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean containsKey(Object key) {
        return getEntry((K) key) != null;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Set<java.util.Map.Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public V get(Object key) {
        Entry<K, V> entry = getEntry((K) key);
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return mapSize != 0;
    }

    @Override
    public Set<K> keySet() {
        if (keySet == null) {
            keySet = new Set<K>() {

                @Override
                public void clear() {
                }

                @Override
                public boolean contains(Object o) {

                    return TreeMap.this.containsKey(o);
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    for (Object o : c) {
                        K key = (K) o;
                        if (TreeMap.this.containsKey(key)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends K> c) {
                    return false;
                }

                @Override
                public boolean isEmpty() {
                    return TreeMap.this.size() != 0;
                }

                @Override
                public Iterator<K> iterator() {
                    return null;
                }


                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public int size() {
                    return TreeMap.this.size();
                }

                @Override
                public Object[] toArray() {
                    return null;
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(K k) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }
            };
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        Entry<K, V> entry = root, parent = null, newNode;
        int result = 0;
        while (entry != null) {
            parent = entry;
            result = ((Comparable<K>) entry.getKey()).compareTo(key);
            if (result == 0) {// Обновить
                entry.setValue(value);
                return value;
            } else if (result > 0) {
                entry = entry.getLeft();
            } else {
                entry = entry.getRight();
            }
        }

        newNode = new Entry<K, V>(key, value, parent);
        if (parent == null) {// Положение корневого узла
            root = newNode;
        } else if (result > 0) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
        mapSize++;
        return value;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
    }

    @Override
    public V remove(Object key) {
        Entry<K, V> entry = getEntry((K) key);
        return remove(entry);
    }

    @Override
    public int size() {
        return mapSize;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    private Entry<K, V> getEntry(K key) {
        Entry<K, V> entry = root, returnEntry;
        int result = 0;
        while (entry != null) {
            result = ((Comparable<K>) entry.getKey()).compareTo(key);
            if (result == 0) {
                return entry;
            } else if (result > 0) {
                entry = entry.getLeft();
            } else {
                entry = entry.getRight();
            }
        }

        return null;

    }

    private boolean removeEntry(K key) {
        Entry<K, V> pEntry, rEntry, entry = getEntry(key); // родительский узел узла и дочерние узлы узла
        if (entry == null) {
            return false;
        }

        if (entry.getLeft() == null || entry.getRight() == null) {
            pEntry = entry.getParent();

            if (entry.getLeft() == null) {
                rEntry = entry.getRight();
            } else {
                rEntry = entry.getLeft();
            }

            if (rEntry != null) {
                rEntry.setParent(pEntry);
            }

            if (pEntry == null) {// узел является корневым узлом
                root = rEntry;
            } else if (((Comparable<K>) pEntry.getValue()).compareTo(entry.getKey()) < 0) {
                pEntry.setRight(entry);
            } else {
                pEntry.setLeft(entry);
            }
        } else {
            rEntry = entry.getRight();
            pEntry = entry;

            while (rEntry.getLeft() != null) {
                pEntry = rEntry;
                rEntry = rEntry.getLeft();
            }

            entry.setValue(rEntry.getValue());

            if (pEntry == entry) {// следующий узел узла не имеет узлов
                entry.setRight(rEntry.getRight());//
            } else {
                pEntry.setLeft(rEntry.getRight());
            }

            if (rEntry.getRight() != null) {
                rEntry.getRight().setParent(pEntry);
            }
        }
        return false;
    }

    private static class Entry<K, V> implements Map.Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> left, right, parent;

        public Entry(K key, V value, Entry<K, V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {

            return this.value = value;
        }

        public Entry<K, V> getLeft() {
            return left;
        }

        public void setLeft(Entry<K, V> left) {
            this.left = left;
        }

        public Entry<K, V> getRight() {
            return right;
        }

        public void setRight(Entry<K, V> right) {
            this.right = right;
        }

        public Entry<K, V> getParent() {
            return parent;
        }

        public void setParent(Entry<K, V> parent) {
            this.parent = parent;
        }


    }

}