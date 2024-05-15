class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void unite(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
}

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailToIndex = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        int n = accounts.size();
        UnionFind uf = new UnionFind(n);

        // Map emails to indices and names
        for (int i = 0; i < n; ++i) {
            List<String> acc = accounts.get(i);
            for (int j = 1; j < acc.size(); ++j) {
                String email = acc.get(j);
                emailToIndex.put(email, i);
                emailToName.put(email, acc.get(0));
            }
        }

        // Union emails with the same owner
        for (List<String> acc : accounts) {
            int root = emailToIndex.get(acc.get(1));
            for (int j = 2; j < acc.size(); ++j) {
                uf.unite(root, emailToIndex.get(acc.get(j)));
            }
        }

        // Group emails by owner
        Map<Integer, Set<String>> mergedAccounts = new HashMap<>();
        for (List<String> acc : accounts) {
            int root = uf.find(emailToIndex.get(acc.get(1)));
            mergedAccounts.putIfAbsent(root, new TreeSet<>());
            for (int j = 1; j < acc.size(); ++j) {
                mergedAccounts.get(root).add(acc.get(j));
            }
        }

        // Build the result
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<Integer, Set<String>> entry : mergedAccounts.entrySet()) {
            List<String> account = new ArrayList<>();
            account.add(emailToName.get(entry.getValue().iterator().next()));
            account.addAll(entry.getValue());
            result.add(account);
        }

        return result;
    }
}