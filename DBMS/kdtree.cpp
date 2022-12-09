#include <bits/stdc++.h>
using namespace std;
int k = 2; // depth
struct Node
{
    vector<int> point;
    Node *left, *right;
};
Node *newNode(vector<int> a)
{
    struct Node *temp = new Node;
    for (int i = 0; i < k; i++)
    {
        temp->point[i] = a[i];
    }

    temp->left = temp->right = NULL;
    return temp;
}
Node *insertNode(Node *root, vector<int> a, int depth)
{
    // if tree is empty we have reached the end
    if (root == NULL)
    {
        return newNode(a);
    }
    // if tree is not empty

    if (depth % k == 0)
    {
        if (a[0] < root->point[0])
        {
            root->left = insertNode(root->left, a, depth + 1);
        }
        else
        {
            root->right = insertNode(root->right, a, depth + 1);
        }
    }
    else
    {
        if (a[1] < root->point[1])
        {
            root->left = insertNode(root->left, a, depth + 1);
        }
        else
        {
            root->right = insertNode(root->right, a, depth + 1);
        }
    }
    return root;
}
Node *insert(Node *root, vector<int> a)
{
    return insertNode(root, a, 0); // 0 as we need to start from root
}
int main()
{
    vector<vector<int>> points;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        vector<int> point;
        for (int j = 0; j < k; j++)
        {
            int a;
            cin >> a;
            point.push_back(a);
        }
        points.push_back(point);
    }
    struct Node *root = NULL;
    for (int i = 0; i < n; i++)
    {
        insert(root, points[i]);
    }
}